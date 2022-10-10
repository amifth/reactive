package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Mono;

public class MonoSubscribeData {

    public static void main(String[] args) {

        // Publisher
        Mono<Integer> mono = Mono.just("Macbook Pro M1 14").map(String::length).map(l -> l);

        // Subscribe without condition check error and completed
        mono.subscribe(i -> System.out.println("Received : " + i));

        // Subscribe with condition check if any error and completed
        mono.subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

    }
}
