package com.assignment2;


import example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest;
import example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse;
import example.costCollegeDaoThree.grpc.DaoThreeGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery3 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        DaoThreeGrpc.DaoThreeBlockingStub stub = DaoThreeGrpc.newBlockingStub(channel);



        CostCollegeDaoThreeResponse DaoQueryThreeResponse= stub.getQueryThree(CostCollegeDaoThreeRequest.newBuilder()
                .setYear(2013)
                .setLength("4-year")
                .setType("Private")
                .build()
        );

        System.out.println(DaoQueryThreeResponse);

        channel.shutdown();


    }
}
