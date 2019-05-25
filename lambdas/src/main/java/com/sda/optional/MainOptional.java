package com.sda.optional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        String text = "abc";
//        String text = null;
        Optional<String> stringOp = Optional.ofNullable(text);
        if (stringOp.isPresent()) {
            System.out.println("Continue text");
        } else {
            System.out.println("Nu contine nimic");
        }

        System.out.println(stringOp.orElse("cde"));
        System.out.println(stringOp.orElseGet(() -> "cde"));

        stringOp.orElseThrow(() -> new IllegalArgumentException());
        stringOp.ifPresent(string -> System.out.println(string));
    }
}
