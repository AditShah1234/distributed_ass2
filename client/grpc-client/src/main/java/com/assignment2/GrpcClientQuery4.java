package com.assignment2;

import example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest;
import example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse;
import example.costCollegeDaoFour.grpc.DaoFourGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery4 {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        DaoFourGrpc.DaoFourBlockingStub stub
                = DaoFourGrpc.newBlockingStub(channel);


        CostCollegeDaoFourResponse DaoQueryFourResponse= stub.getQueryFour(CostCollegeDaoFourRequest.newBuilder()
                .setLength("4-year")
                .setType("Private")
                .setDuration("3")
                .build()
        );

        System.out.println(DaoQueryFourResponse);

        channel.shutdown();


    }
}
