package com.assignment2;


import example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest;
import example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse;
import example.costCollegeDaoOne.grpc.DaoOneGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        DaoOneGrpc.DaoOneBlockingStub stub
                = DaoOneGrpc.newBlockingStub(channel);


        CostCollegeDaoOneResponse DaoOneResponse= stub.getQueryOne(CostCollegeDaoOneRequest.newBuilder()
                .setYear(2013)
                .setExpense("Fees/Tuition")
                .setLength("4-year")
                .setState("Alabama")
                .setType("Private")
                .build()
        );

        System.out.println(DaoOneResponse);

        channel.shutdown();


    }
}