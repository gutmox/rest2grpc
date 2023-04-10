package com.gutmox;

import io.grpc.ManagedChannel;
import io.micronaut.context.annotation.Factory;
import io.micronaut.grpc.annotation.GrpcChannel;
import io.vertx.core.Vertx;
import io.vertx.grpc.client.GrpcClient;
import jakarta.inject.Singleton;

@Factory
public class SimpleGrpcClientBean {

    @Singleton
    Rest2grpcServiceGrpc.Rest2grpcServiceFutureStub eseStub(
            @GrpcChannel("simple") ManagedChannel channel) {
        return Rest2grpcServiceGrpc.newFutureStub(channel);
    }

    @Singleton
    GrpcClient vertxStub() {
        return GrpcClient.client(Vertx.currentContext().owner());
    }
}
