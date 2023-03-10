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

public class costCollegeDao {





    public void quarryZero(MongoDatabase database) throws IOException {
        String path = "src/main/java/mongodb/nces330_20.csv";
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",");   //sets the delimiter pattern
        List<Document> doc = new ArrayList<>();
        MongoCollection<Document> collection = database.getCollection("EduCostStat");
        int i =0;
        System.out.println(i);
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            List<String[]> rows = reader.readAll();
            for (String[] row : rows) {
                if (i==0){
                    i+=1;
                    continue;
                }
                for (int j =0 ;j<row.length;j=j+6) {
                    document tmp = new document(Integer.parseInt(row[j]), row[j+1],row[j+2],row[j+3],row[j+4],Integer.parseInt(row[j+5]));
                    System.out.println(tmp.toString());
                    doc.add(tmp.getDoc());
                }
                System.out.println();


            }
        }

        System.out.println(doc.size());
        collection.insertMany(doc);

    }
    public void quarryOne(Integer year, String state,String type, String length, String expense,MongoDatabase database){

        MongoCollection<Document> collection = database.getCollection("EduCostStat");
        BasicDBObject query = new BasicDBObject();
        query.put("year", year);
        query.put("state", state);
        query.put("type", type);
        query.put("length", length);
        query.put("expense", expense);
        System.out.println(query.toString());
        FindIterable<Document> documents = collection.find(query);


        MongoCursor<Document> cursor = documents.iterator();
        while (cursor.hasNext()) {
            Document document = cursor.next();
            System.out.println(document.toJson());
        }
//        MongoCollection<Document> collection_new1= database.getCollection("EduCostStatQueryThree");
//        collection_new1.drop();
//        collection_new1.insertOne(cursor);


    }
    public void quarryTwo(Integer year, String type, String length, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");


        Bson match_string = Aggregates.match(Filters.and(
                Filters.eq("year", year),
                Filters.eq("type", type),
                Filters.eq("length", length)
        ));

        Bson groupby = Aggregates.group("$state", Accumulators.sum("totalExpense", "$value"));

        Bson sort_max = Aggregates.sort(Sorts.descending("totalExpense"));

        Bson limit = Aggregates.limit(5);

        List<Document> results = collection.aggregate(Arrays.asList(match_string, groupby, sort_max, limit))
                .into(new ArrayList<>());
        for (Document doc : results) {
            System.out.println(doc.toJson());
        }
        MongoCollection<Document> collection_new2= database.getCollection("EduCostStatQueryTwo");
        collection_new2.drop();
        collection_new2.insertMany(results);



    }
    public void quarryThree(Integer year, String type, String length, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");


        Bson match_string = Aggregates.match(Filters.and(
                Filters.eq("year", year),
                Filters.eq("type", type),
                Filters.eq("length", length)
        ));

        Bson groupby = Aggregates.group("$state", Accumulators.sum("totalExpense", "$value"));

        Bson sort_max = Aggregates.sort(Sorts.ascending("totalExpense"));

        Bson limit= Aggregates.limit(5);

        List<Document> results = collection.aggregate(Arrays.asList(match_string, groupby, sort_max, limit))
                .into(new ArrayList<>());
        for (Document doc : results) {
            System.out.println(doc.toJson());
        }
        MongoCollection<Document> collection_new3= database.getCollection("EduCostStatQueryThree");
        collection_new3.drop();
        collection_new3.insertMany(results);

    }


    public void quarryFour(String type, String length, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");


        Bson match_string = Aggregates.match(Filters.and(
                Filters.eq("type", type),
                Filters.eq("length", length),
                Filters.or(Filters.eq("year",2021),Filters.eq("year",2013))
        ));
        ArrayList<Document> doc = new ArrayList<>();
        doc.add(new Document("state", "$state"));
        doc.add(new Document("year", "$year"));

        Bson groupby = Aggregates.group(doc,Accumulators.sum("totalExpense", "$value"));


        Bson sort_year = Aggregates.sort(Sorts.ascending("_id"));


        List<Document> results = collection.aggregate(Arrays.asList(match_string, groupby,sort_year))
                .into(new ArrayList<>());

//        System.out.println(results.toString());
        int current,start;
        float ratio_change;
        ArrayList<Document> answer = new ArrayList<>();
//        System.out.println(results.size());
        for(int i=0;i<results.size();i+=2){
            try {
                Document d = results.get(i);


                ArrayList<Document> tmp_start = (ArrayList) d.get("_id");
                start = Integer.parseInt(d.get("totalExpense").toString());


                Document d1 = results.get(i + 1);


                ArrayList<Document> tmp_current = (ArrayList) d1.get("_id");
                current = Integer.parseInt(d1.get("totalExpense").toString());

                if (tmp_start.get(0).get("state").toString().equals(tmp_current.get(0).get("state").toString())) {
                    ratio_change = ((float) current - (float) start) / (float) start;

                    Document tmp = new Document("state", tmp_start.get(0).get("state").toString()).append("year_last", tmp_current.get(1).get("year").toString()).append("year_now", tmp_start.get(1).get("year").toString()).append("ratio", ratio_change);
                    answer.add(tmp);
                }
            }catch(Exception e){
                i+=1;
            }

        }


        MongoCollection<Document> collection_new4 = database.getCollection("EduCostStatQueryFour");
        collection_new4.drop();
        collection_new4.insertMany(answer);
        ArrayList<Document>arr =new ArrayList<>();
        collection_new4.find().sort(descending("ratio")).limit(5).into(arr);
        for (Document result : arr) {
            System.out.println(result.toJson());
        }

        collection_new4.drop();
        collection_new4.insertMany(arr);




    }

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

