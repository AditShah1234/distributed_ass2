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

public class costCollegeDaoFour {





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


}

