package com.assignment2.grpc.service;

import example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest;
import example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse;
import example.costCollegeDaoFour.grpc.DaoFourGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService

public class DaoFourImpl extends DaoFourGrpc.DaoFourImplBase{
    @Override
    public void getQueryFour(CostCollegeDaoFourRequest request, StreamObserver<CostCollegeDaoFourResponse> responseObserver) {
        String type = request.getType();
        String length = request.getLength();

        System.out.println("Type: " + type);
        System.out.println("Length: " + length);

        CostCollegeDaoFourResponse costCollegeDaoFourResponse=CostCollegeDaoFourResponse.newBuilder()
                .setMessage("Year " +type+ ":")
                .build();
        responseObserver.onNext(costCollegeDaoFourResponse);
        responseObserver.onCompleted();

    }
}
