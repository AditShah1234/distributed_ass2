package com.assignment2.grpc.DAO;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.*;
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
import static com.mongodb.client.model.Aggregates.*;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Indexes.descending;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.*;
import static com.mongodb.client.model.Accumulators.*;

import static com.assignment2.grpc.DAO.config.database;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class costCollegeDaoFour {


    public void quarryFour(String type, String length,  String year_len) {
        MongoCollection<Document> collection = database.getCollection("EduCostStat");
        Integer second_year = 2021- Integer.parseInt(year_len);
        Bson matchStage = match(and(
                eq("type", type),
                eq("length", length),
                or(eq("year", 2021), eq("year", second_year))
        ));
        Bson projectStage = project(fields(
                include("state", "year","value"),
                excludeId()
        ));


        Bson groupStage = group("$state",
                Accumulators.sum("now", new Document("$sum",new Document("$cond", Arrays.asList(
                        new Document("$eq", Arrays.asList("$year", 2021)),
                        "$value",
                        0
                )))),
                Accumulators.sum("start", new Document("$sum",new Document("$cond", Arrays.asList(
                        new Document("$eq", Arrays.asList("$year", second_year)),
                        "$value",
                        0
                ))))
        );
        Bson project2Stage = project(fields(
                computed("growth",new Document("$divide", Arrays.asList(new Document("$subtract", Arrays.asList(
                        "$now",
                        "$start"
                )),"$now")))

        ));
        Bson sort_max = Aggregates.sort(Sorts.descending("growth"));

        Bson limit = Aggregates.limit(5);

        List<Document> queryResult = collection.aggregate(Arrays.asList(matchStage,
                projectStage,groupStage,project2Stage,sort_max,limit)).into(new ArrayList<>());
        System.out.println(queryResult.toString());
        MongoCollection<Document> collection_new4 = database.getCollection("EduCostStatQueryFour");
        collection_new4.drop();
        collection_new4.insertMany(queryResult);

    }

       }




