package com.example.reactives.chapter1.assignment;

import com.example.reactives.utils.Utils;

public class AssigmentChapterOne {

    public static void main(String[] args) {

        Service.write("file_chapter_01.txt", "This is file assignment for chapter 01")
                .subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

        Service.read("file_chapter_01.txt")
                .subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

        Service.delete("file_chapter_01.txt")
                .subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

    }

}
