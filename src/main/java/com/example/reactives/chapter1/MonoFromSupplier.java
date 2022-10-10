package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MonoFromSupplier {

    public static void main(String[] args) {
        Supplier<String> supplier = MonoFromSupplier::getValue;
        Mono<String> mono = Mono.fromSupplier(supplier);
        mono.subscribe(Utils.onNext());

        Callable<String> callable = MonoFromSupplier::getValue;
        Mono.fromCallable(callable).subscribe(Utils.onNext());
    }

    private static String getValue() {
        System.out.println("Generate value...");
        return Utils.faker().name().fullName();
    }
}
