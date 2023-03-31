package com.assignment2.grpc.service;

import com.assignment2.grpc.DAO.costCollegeDaoOne;
import example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest;
import example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse;
import example.costCollegeDaoOne.grpc.DaoOneGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class DaoOneImpl extends DaoOneGrpc.DaoOneImplBase{

    @Override
    public void getQueryOne(CostCollegeDaoOneRequest request, StreamObserver<CostCollegeDaoOneResponse> responseObserver) {
        int year = request.getYear();
        String state = request.getState();
        String type = request.getType();
        String length = request.getLength();
        String expense = request.getExpense();
        String out;
        System.out.println("Year: " + year);
        System.out.println("State: " + state);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        System.out.println("Expense: " + expense);
        costCollegeDaoOne quarry1 = new costCollegeDaoOne();
        try {

            out= quarry1.quarryOne(year, state, type, length, expense);
            System.out.println(out);
        }catch (Exception e){
            out= "Error "+e.toString();
        }
        CostCollegeDaoOneResponse costCollegeDaoOneResponse=CostCollegeDaoOneResponse.newBuilder()
                .setMessage(out)
                .build();
        responseObserver.onNext(costCollegeDaoOneResponse);
        responseObserver.onCompleted();

 }
}
