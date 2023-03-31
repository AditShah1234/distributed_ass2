package com.assignment2.grpc.DAO;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class config {

    static ConnectionString connectionString = new ConnectionString("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test");
    static MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    public static MongoClient mongoClient = MongoClients.create(settings);
    static public MongoDatabase database = mongoClient.getDatabase("Adit_assignment2");
}
