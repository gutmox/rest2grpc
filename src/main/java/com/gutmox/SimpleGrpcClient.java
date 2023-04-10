package com.gutmox;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.concurrent.Executors;
import java.util.function.Consumer;

@Singleton
public class SimpleGrpcClient {

    private Rest2grpcServiceGrpc.Rest2grpcServiceFutureStub stub;

    public SimpleGrpcClient(Rest2grpcServiceGrpc.Rest2grpcServiceFutureStub stub) {
        this.stub = stub;
    }

    Mono<String> getMessage(String name) {
        return Mono.create(getMonoSinkConsumer(stub
                        .send(Rest2grpcRequest.newBuilder().setName(name).build())))
                .map(Rest2grpcReply::getMessage);
    }

    private static Consumer<MonoSink<Rest2grpcReply>> getMonoSinkConsumer(ListenableFuture<Rest2grpcReply> reply) {
        return voidMonoSink -> Futures.addCallback(reply, new FutureCallback<>() {
            @Override
            public void onSuccess(Rest2grpcReply result) {
                voidMonoSink.success(result);
            }

            @Override
            public void onFailure(Throwable t) {
                voidMonoSink.error(new RuntimeException(t));
            }
        }, Executors.newCachedThreadPool());
    }
}
