package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class SupplierRefactoring {

    public static void main(String[] args) {
        getValue();
        String val = getValue().subscribeOn(Schedulers.boundedElastic()).block();
        System.out.println(val);
        getValue();
        Utils.sleepSeconds(4);
    }

    private static Mono<String> getValue() {
        return Mono.fromSupplier(() -> {
            Utils.sleepSeconds(3);
            return Utils.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
