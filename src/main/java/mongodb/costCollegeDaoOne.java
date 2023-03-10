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

public class costCollegeDaoOne {






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
    }

}

