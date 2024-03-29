package com.assignment2.grpc.DAO;

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

import static com.assignment2.grpc.DAO.config.database;
import static com.mongodb.client.model.Indexes.descending;

public class costCollegeDaoThree {






    public void quarryThree(Integer year, String type, String length) {
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


}

