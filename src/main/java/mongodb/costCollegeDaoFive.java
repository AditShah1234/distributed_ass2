package mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.*;
import com.opencsv.CSVReader;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Accumulators.avg;
import static com.mongodb.client.model.Aggregates.facet;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import static com.mongodb.client.model.Aggregates.sort;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.*;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.*;
import static com.mongodb.client.model.Filters.eq;
import static javax.management.Query.div;


import java.util.*;


public class costCollegeDaoFive {
    public void quarryFive(Integer year , String type, String length, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");



        Map<String, List<String>> usRegions = new HashMap<>();
        Map<String, String> usStates = new HashMap<>();


        usRegions.put("Northeast", Arrays.asList(  "Massachusetts", "Rhode Island","Connecticut","Vermont","New Hampshire","Maine","Pennsylvania","New Jersey","New York"));
        usRegions.put("Southeast", Arrays.asList("Washington","Georgia","North Carolina","South Carolina","Virginia","West Virginia","Kentucky","Tennessee","Mississippi","Alabama","Delaware","Maryland","Florida","Louisiana","Arkansas"));
        usRegions.put("Midwest", Arrays.asList("Minnesota", "Wisconsin", "Illinois", "Ohio", "Indiana", "Michigan", "Missouri", "Iowa", "Kansas", "Nebraska", "North Dakota", "South Dakota"));
        usRegions.put("Southwest", Arrays.asList("New Mexico", "Arizona", "Oklahoma", "Texas"));
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
                eq("type", type),
                eq("length", length),
                eq("year", year)
        ));
        ArrayList<Document> doc = new ArrayList<>();
        doc.add(new Document("state","$state"));
        doc.add(new Document("year", "$year"));


        List<Facet> facetStage =  Arrays.asList(new Facet("Northeast", Arrays.asList(
                                match(and(eq("type", type),eq("length", length),
                                                eq("year", year),in("state",usRegions.get("Northeast")))),
                                group("total_expense",sum("totalExpense", "$value")),
                                project(fields(computed("avg",new Document("$divide",Arrays.asList("$totalExpense",usRegions.get("Northeast").size()))))))
                ),

                new Facet("Southeast", Arrays.asList(
                        match(and(eq("type", type),eq("length", length),
                                eq("year", year),in("state",usRegions.get("Southeast")))),
                        group("total_expense",sum("totalExpense", "$value")),
                        project(fields(computed("avg",new Document("$divide",Arrays.asList("$totalExpense",usRegions.get("Southeast").size()))))))
                ),
                new Facet("Midwest", Arrays.asList(
                        match(and(eq("type", type),eq("length", length),
                                eq("year", year),in("state",usRegions.get("Midwest")))),
                        group("total_expense",sum("totalExpense", "$value")),
                        project(fields(computed("avg",new Document("$divide",Arrays.asList("$totalExpense",usRegions.get("Midwest").size()))))))
                ),
                new Facet("Southwest", Arrays.asList(
                        match(and(eq("type", type),eq("length", length),
                                eq("year", year),in("state",usRegions.get("Southwest")))),
                        group("total_expense",sum("totalExpense", "$value")),
                        project(fields(computed("avg",new Document("$divide",Arrays.asList("$totalExpense",usRegions.get("Southwest").size()))))))
                ),
            new Facet("West", Arrays.asList(
                match(and(eq("type", type),eq("length", length),
                        eq("year", year),in("state",usRegions.get("West")))),
                group("total_expense",sum("totalExpense", "$value")),
                project(fields(computed("avg",new Document("$divide",Arrays.asList("$totalExpense",usRegions.get("West").size()))))))
        )
        );
        Bson f1 = facet(facetStage);


        List<Document> queryResult = collection.aggregate(Arrays.asList(
                f1
        )).into(new ArrayList<>());
        System.out.println(queryResult);

        MongoCollection<Document> collection_new1 = database.getCollection("EduCostStatQueryFive");
        collection_new1.drop();

        collection_new1.insertMany(queryResult);

    }


}

