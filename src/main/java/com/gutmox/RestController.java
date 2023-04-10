package com.gutmox;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Observable;
import reactor.core.publisher.Mono;

@Controller("/simple")
public class RestController {

    private final SimpleGrpcClient grpcClient;

    private final SimpleVertxGrpcClient vertxGrpcClient;

    public RestController(SimpleGrpcClient grpcClient, SimpleVertxGrpcClient vertxGrpcClient) {
        this.grpcClient = grpcClient;
        this.vertxGrpcClient = vertxGrpcClient;
    }

    @Get("/{name}")
    public Mono<String> findByName(final String name) {
        return grpcClient.getMessage(name);
    }

    @Get("/vertx/{name}")
    public Mono<String> findByNameVertx(final String name) {
        return vertxGrpcClient.getMessage(name);
    }
}
