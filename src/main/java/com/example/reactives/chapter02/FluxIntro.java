package com.example.reactives.chapter02;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Flux;

public class FluxIntro {

    public static void main(String[] args) {

        Flux<Object> flux = Flux.just(1, 2, 3, "a", Utils.faker().name().fullName());
        flux.subscribe(Utils.onNext(),
                Utils.onError(),
                Utils.onComplete());
    }

}
