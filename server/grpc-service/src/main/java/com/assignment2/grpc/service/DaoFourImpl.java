package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoFour;
import com.assignment2.grpc.DAO.costCollegeDaoThree;
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


        costCollegeDaoFour quarry4 = new costCollegeDaoFour();
        String out;
        try {
            quarry4.quarryFour(type, length,"3");
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
