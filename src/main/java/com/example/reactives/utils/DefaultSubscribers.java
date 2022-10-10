package com.example.reactives.utils;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class DefaultSubscribers implements Subscriber<Object> {

    private String value = "";

    public DefaultSubscribers(String value) {
        this.value = value + " - ";
    }

    public DefaultSubscribers() {}

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MIN_VALUE);

    }

    @Override
    public void onNext(Object o) {
        System.out.println(value + "Received: " + o);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(value + "Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println(value + "Complete");
    }
}
