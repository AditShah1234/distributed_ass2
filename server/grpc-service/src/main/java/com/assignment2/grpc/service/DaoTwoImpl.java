package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoTwo;
import example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest;
import example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse;
import example.costCollegeDaoTwo.grpc.DaoTwoGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService

public class DaoTwoImpl extends DaoTwoGrpc.DaoTwoImplBase{
    @Override
    public void getQueryTwo(CostCollegeDaoTwoRequest request, StreamObserver<CostCollegeDaoTwoResponse> responseObserver) {
        int year = request.getYear();
        String type = request.getType();
        String length = request.getLength();

        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        costCollegeDaoTwo quarry2 = new costCollegeDaoTwo();



        String out;
        try {
            quarry2.quarryTwo(year,type,length);
            out= "Done";
        }catch (Exception e){
            out ="Error "+ e;
        }



        CostCollegeDaoTwoResponse costCollegeDaoTwoResponse=CostCollegeDaoTwoResponse.newBuilder()
                .setMessage(out)
                .build();
        responseObserver.onNext(costCollegeDaoTwoResponse);
        responseObserver.onCompleted();

    }
}
