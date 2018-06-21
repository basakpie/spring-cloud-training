package com.basakpie.biz1;

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

}
