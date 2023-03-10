package mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import com.opencsv.CSVReader;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.mongodb.client.model.Indexes.descending;

public class costCollegeDaoFive {
    public void quarryFive(Integer year , String type, String length, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");



        Map<String, List<String>> usRegions = new HashMap<>();
        Map<String, String> usStates = new HashMap<>();


        usRegions.put("Northeast", Arrays.asList(  "Massachusetts", "Rhode Island","Connecticut","Vermont","New Hampshire","Maine","Pennsylvania","New Jersey","New York"));
        usRegions.put("Southeast", Arrays.asList("Washington","Georgia","North Carolina","South Carolina","Virginia","West Virginia","Kentucky","Tennessee","Mississippi","Alabama","Delaware","Maryland","Florida","Louisiana","Arkansas"));
        usRegions.put("Midwest", Arrays.asList("Minnesota", "Wisconsin", "Illinois", "Ohio", "Indiana", "Michigan", "Missouri", "Iowa", "Kansas", "Nebraska", "North Dakota", "South Dakota"));
        usRegions.put("Soutwest", Arrays.asList("New Mexico", "Arizona", "Oklahoma", "Texas"));
        usRegions.put("West", Arrays.asList("California", "Colorado", "Nevada", "Hawaii", "Alaska", "Oregon", "Utah", "Idaho", "Montana", "Wyoming", "Washington"));


        for (Map.Entry<String, List<String>> entry : usRegions.entrySet()) {
            String region = entry.getKey();
            List<String> states = entry.getValue();
            for (String state : states) {
                usStates.put(state, region);
            }
        }



//        System.out.println(usStates);
        Bson match_string = Aggregates.match(Filters.and(
                Filters.eq("type", type),
                Filters.eq("length", length),
                Filters.eq("year", year)
        ));
        ArrayList<Document> doc = new ArrayList<>();
        doc.add(new Document("state","$state"));
        doc.add(new Document("year", "$year"));


        Bson groupby = Aggregates.group(doc, Accumulators.sum("totalExpense", "$value"));


        Bson sort_year = Aggregates.sort(Sorts.ascending("_id"));


        List<Document> results = collection.aggregate(Arrays.asList(match_string, groupby, sort_year))
                .into(new ArrayList<>());

//        System.out.println(results.toString());

        Map <String,Integer> map = new HashMap<>();


        for (Document result : results) {


            ArrayList<Document> tmp = (ArrayList) result.get("_id");

            int amt = Integer.parseInt(result.get("totalExpense").toString());
            String state = tmp.get(0).get("state").toString();

            if (usStates.get(state) == null)
                map.put(state, amt);
            else {
                if (map.containsKey(usStates.get(state))) {

                    map.put(usStates.get(state), map.get(usStates.get(state)) + amt);
                } else
                    map.put(usStates.get(state), amt);
            }
        }




        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
        List<Document> answer = new ArrayList<>();
        for(int i =list.size()-1;i>0;i--){
            Document tmp = new Document("region",list.get(i).getKey()).append("expense",list.get(i).getValue());
            answer.add(tmp);
        }
        MongoCollection<Document> collection_new1 = database.getCollection("EduCostStatQueryFive");
        collection_new1.drop();

        collection_new1.insertMany(answer);

    }
}

