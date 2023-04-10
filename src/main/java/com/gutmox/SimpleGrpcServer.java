package com.gutmox;

import io.grpc.stub.StreamObserver;
import jakarta.inject.Singleton;

@Singleton
public class SimpleGrpcServer extends Rest2grpcServiceGrpc.Rest2grpcServiceImplBase {

    public void send(Rest2grpcRequest request, StreamObserver<Rest2grpcReply> response) {
        response.onNext(Rest2grpcReply.newBuilder().setMessage("server message").build());
        response.onCompleted();
    }
}
