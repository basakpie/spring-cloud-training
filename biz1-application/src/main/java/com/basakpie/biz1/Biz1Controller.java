package com.basakpie.biz1;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
public class Biz1Controller {

    @GetMapping("/")
    public Mono<String> index() {
        return Mono.just("Hello Biz1 Application! >> "+ LocalDateTime.now().toString());
    }

    @GetMapping("/hystrix_test")
    @HystrixCommand(fallbackMethod = "hystrixTestFallback")
    public Mono<String> hystrixTest() throws IllegalAccessException {
        throw new IllegalAccessException("Biz1 hystrix hystrix_test exception");
    }

    public Mono<String> hystrixTestFallback(){
        return Mono.just("Hello Biz2 hystrix_test Application! >> "+ LocalDateTime.now().toString());
    }

}
