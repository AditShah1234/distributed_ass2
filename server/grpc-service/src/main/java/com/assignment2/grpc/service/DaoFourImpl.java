package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoFour;
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
        String duration = request.getDuration();
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        System.out.println("Duration: " + duration);


        costCollegeDaoFour quarry4 = new costCollegeDaoFour();
        String out;
        try {
            quarry4.quarryFour(type, length,duration);
            out= "Done";
        }catch (Exception e){
            out ="Error "+ e;
        }

        CostCollegeDaoFourResponse costCollegeDaoFourResponse=CostCollegeDaoFourResponse.newBuilder()
                .setMessage(out)
                .build();
        responseObserver.onNext(costCollegeDaoFourResponse);
        responseObserver.onCompleted();

    }
}
