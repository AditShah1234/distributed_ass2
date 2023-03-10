package mongodb;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.opencsv.CSVReader;
import org.bson.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static ConnectionString connectionString = new ConnectionString("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test");
    static MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    static MongoClient mongoClient = MongoClients.create(settings);
    static public  MongoDatabase database = mongoClient.getDatabase("Adit_assignment2");


    public static void main(String[] args) throws IOException {
        Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
        costCollegeDao quarry = new costCollegeDao();
        costCollegeDaoOne quarry1 = new costCollegeDaoOne();
        costCollegeDaoTwo quarry2 = new costCollegeDaoTwo();
        costCollegeDaoThree quarry3 = new costCollegeDaoThree();
        costCollegeDaoFour quarry4 = new costCollegeDaoFour();
        costCollegeDaoFive quarry5 = new costCollegeDaoFive();

//        quarry.quarryZero(database);
        System.out.println("###################################################( ONE )##############################################################");
        quarry1.quarryOne(2013,"Alabama","Private" , "4-year" ,"Fees/Tuition", database);
        System.out.println("#######################################################( TWO )##########################################################");
        quarry2.quarryTwo(2013,"Private" , "4-year" , database);
        System.out.println("##########################################################( THREE)#######################################################");
        quarry3.quarryThree(2013,"Private" , "4-year" , database);
        System.out.println("################################################################( FOUR )#################################################");
        quarry4.quarryFour("Private" , "4-year" , database);
        System.out.println("################################################################( FIVE )#################################################");
        quarry5.quarryFive(2021,"Private" , "4-year" , database);
        mongoClient.close();



    }

}
