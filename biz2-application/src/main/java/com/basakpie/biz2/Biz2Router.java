//package com.basakpie.biz2;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.config.EnableWebFlux;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import static org.springframework.http.MediaType.TEXT_PLAIN;
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
//
//@Configuration
//@EnableWebFlux
//public class Biz2Router {
//
//    @Bean
//    public RouterFunction<ServerResponse> routes(Biz2Handler biz2Handler) {
//        return RouterFunctions.route(GET("/").and(accept(TEXT_PLAIN)), biz2Handler::index);
//    }
//
//}
