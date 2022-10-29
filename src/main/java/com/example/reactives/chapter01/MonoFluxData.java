package com.example.reactives.chapter01;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class MonoFluxData {

    public static void main(String[] args) {

        List<Integer> itemsFromMono = new ArrayList<>();
        List<Integer> itemsFromFlux = new ArrayList<>();

        // Mono
        Mono<Integer> mono = Mono.just(121);
        // Subscribe to Mono
        mono.subscribe(itemsFromMono::add);

        // Flux
        Flux<Integer> flux = Flux.just(12, 14, 9, 11, 12, 14, 9, 11, 12, 14, 9, 11, 12, 14);
        // Subscribe to Flux
        flux.subscribe(itemsFromFlux::add);

        System.out.println("Received : " + itemsFromMono);
        System.out.println("Received : " + itemsFromFlux);
    }

}
