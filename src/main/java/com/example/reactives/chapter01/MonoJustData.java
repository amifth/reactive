package com.example.reactives.chapter01;

import reactor.core.publisher.Mono;

public class MonoJustData {

    public static void main(String[] args) {

        // Publisher
        Mono<Integer> mono = Mono.just(1);
        mono.subscribe(i -> System.out.println("Received : " + i));

        Mono<String> monoString = Mono.just("Macbook");
        monoString.subscribe(i -> System.out.println("Received : " + i));

    }

}
