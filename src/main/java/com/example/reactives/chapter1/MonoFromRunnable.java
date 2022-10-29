package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;

public class MonoFromRunnable {

    private static Runnable timeConsumingProcess(){
        return () -> {
            Utils.sleepSeconds(3);
            System.out.println("Operation completed");
        };
    }

}
