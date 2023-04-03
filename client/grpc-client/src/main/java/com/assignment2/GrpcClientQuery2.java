package com.assignment2;


import example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse;
import example.costCollegeDaoOne.grpc.DaoOneGrpc;
import example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest;
import example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse;
import example.costCollegeDaoTwo.grpc.DaoTwoGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("34.125.125.21", 9090)
                .usePlaintext()
                .build();
        DaoTwoGrpc.DaoTwoBlockingStub stub
                = DaoTwoGrpc.newBlockingStub(channel);


        CostCollegeDaoTwoResponse DaoQueryTwoResponse= stub.getQueryTwo(CostCollegeDaoTwoRequest.newBuilder()
                .setYear(2013)
                .setLength("4-year")
                .setType("Private")
                .build()
        );

        System.out.println(DaoQueryTwoResponse);

        channel.shutdown();


    }
}
