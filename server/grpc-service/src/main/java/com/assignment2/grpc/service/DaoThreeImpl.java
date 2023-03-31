package com.assignment2.grpc.service;

import example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest;
import example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse;
import example.costCollegeDaoThree.grpc.DaoThreeGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService

public class DaoThreeImpl extends DaoThreeGrpc.DaoThreeImplBase{
    @Override
    public void getQueryThree(CostCollegeDaoThreeRequest request, StreamObserver<CostCollegeDaoThreeResponse> responseObserver) {
        int year = request.getYear();
        String type = request.getType();
        String length = request.getLength();

        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);

        CostCollegeDaoThreeResponse costCollegeDaoThreeResponse=CostCollegeDaoThreeResponse.newBuilder()
                .setMessage("Year " +year+ ":")
                .build();
        responseObserver.onNext(costCollegeDaoThreeResponse);
        responseObserver.onCompleted();

    }
}
