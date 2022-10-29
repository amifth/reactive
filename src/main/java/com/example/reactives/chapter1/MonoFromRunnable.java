package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Mono;

public class MonoFromRunnable {

    public static void main(String[] args) {
        Mono.fromRunnable(timeConsumingProcess())
                .subscribe(Utils.onNext(),
                        Utils.onError(),
                        () -> {
                            System.out.println("process is done. Sending emails...");
                        });


    }

    private static Runnable timeConsumingProcess(){
        return () -> {
            Utils.sleepSeconds(3);
            System.out.println("Operation completed");
        };
    }

}
