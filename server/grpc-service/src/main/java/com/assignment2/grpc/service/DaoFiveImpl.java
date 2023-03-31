package com.assignment2.grpc.service;

import example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest;
import example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse;
import example.costCollegeDaoFive.grpc.DaoFiveGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService

public class DaoFiveImpl extends DaoFiveGrpc.DaoFiveImplBase{
    @Override
    public void getQueryFive(CostCollegeDaoFiveRequest request, StreamObserver<CostCollegeDaoFiveResponse> responseObserver) {
        String type = request.getType();
        String length = request.getLength();

        System.out.println("Type: " + type);
        System.out.println("Length: " + length);

        CostCollegeDaoFiveResponse costCollegeDaoFiveResponse=CostCollegeDaoFiveResponse.newBuilder()
                .setMessage("Type " +type+ ":")
                .build();
        responseObserver.onNext(costCollegeDaoFiveResponse);
        responseObserver.onCompleted();

    }
}
