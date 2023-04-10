package com.gutmox;

import io.grpc.examples.helloworld.HelloRequest;
import io.vertx.core.Future;
import io.vertx.core.net.SocketAddress;
import io.vertx.grpc.client.GrpcClient;
import io.vertx.grpc.client.GrpcClientRequest;
import io.vertx.grpc.common.GrpcReadStream;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

import java.util.concurrent.Executors;

@Singleton
public class SimpleVertxGrpcClient {

    private Future<GrpcClientRequest<Rest2grpcRequest, Rest2grpcReply>> clientRequest;

    public SimpleVertxGrpcClient(GrpcClient client) {
        var socketAddress = SocketAddress.inetSocketAddress(443, "localhost");
        clientRequest = client.request(socketAddress, Rest2grpcServiceGrpc.getSendMethod());
    }

    Mono<String> getMessage(String name) {
        return Mono.create(sink -> {
            clientRequest.onSuccess(r -> {
                r.end(Rest2grpcRequest.newBuilder().setName(name).build());
                r.response().compose(GrpcReadStream::last)
                        .onSuccess(res -> sink.success(res.getMessage()));
            });
            clientRequest.onFailure(sink::error);
        });
    }
}
