//package com.basakpie.biz2;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//import java.time.LocalDateTime;
//
//import static org.springframework.http.MediaType.TEXT_PLAIN;
//import static org.springframework.web.reactive.function.server.ServerResponse.ok;
//
//@Component
//public class Biz2Handler {
//
//    public Mono<ServerResponse> index(ServerRequest request) {
//        return ok().contentType(TEXT_PLAIN).body(BodyInserters.fromObject("Hello Biz2 Application! >> " + LocalDateTime.now().toString()));
//    }
//
//}
