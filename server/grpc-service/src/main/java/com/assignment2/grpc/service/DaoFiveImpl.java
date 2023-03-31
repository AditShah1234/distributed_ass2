package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoFive;
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
        costCollegeDaoFive quarry5 = new costCollegeDaoFive();
        String out;
        try {
            quarry5.quarryFive(2021,type,length);
            out= "Done";
        }catch (Exception e){
            out ="Error "+ e;
        }

        CostCollegeDaoFiveResponse costCollegeDaoFiveResponse=CostCollegeDaoFiveResponse.newBuilder()
                .setMessage(out)
                .build();
        responseObserver.onNext(costCollegeDaoFiveResponse);
        responseObserver.onCompleted();

    }
}
