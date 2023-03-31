package com.assignment2;

import example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest;
import example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse;
import example.costCollegeDaoFive.grpc.DaoFiveGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery5 {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        DaoFiveGrpc.DaoFiveBlockingStub stub
                = DaoFiveGrpc.newBlockingStub(channel);


        CostCollegeDaoFiveResponse DaoQueryFiveResponse= stub.getQueryFive(CostCollegeDaoFiveRequest.newBuilder()
                .setYear(2013)
                .setLength("4-year")
                .setType("Private")
                .build()
        );

        System.out.println(DaoQueryFiveResponse);

        channel.shutdown();


    }
}
