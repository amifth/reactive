package com.example.reactives.chapter1;

import com.example.reactives.utils.Utils;
import reactor.core.publisher.Mono;

public class MonoEmptyOrErrorData {

    public static void main(String[] args) {
        userRepository(20).subscribe(
                Utils.onNext(),
                Utils.onError(),
                Utils.onComplete());
    }


    private static Mono<String> userRepository(Integer userId){
        if (userId == 1){
            return Mono.just(Utils.faker().name().fullName());
        } else if(userId == 2){
            return Mono.empty(); // null
        } else
            return Mono.error(new RuntimeException("Not in the allowed range"));
    }

}
