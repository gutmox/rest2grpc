package com.gutmox;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Observable;
import reactor.core.publisher.Mono;

@Controller("/simple")
public class RestController {

    private final SimpleGrpcClient grpcClient;

    public RestController(SimpleGrpcClient grpcClient) {
        this.grpcClient = grpcClient;
    }

    @Get("/{name}")
    public Mono<String> findByName(final String name) {
        return grpcClient.getMessage(name);
    }
}
