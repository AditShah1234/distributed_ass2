package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoThree;
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
        costCollegeDaoThree quarry3 = new costCollegeDaoThree();



        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        String out;
        try {
            quarry3.quarryThree(year, type, length);
            out= "Done";
        }catch (Exception e){
            out ="Error "+ e;
        }

        CostCollegeDaoThreeResponse costCollegeDaoThreeResponse=CostCollegeDaoThreeResponse.newBuilder()
                .setMessage(out)
                .build();
        responseObserver.onNext(costCollegeDaoThreeResponse);
        responseObserver.onCompleted();

    }
}
