package com.kangyonggan.extra;

import com.kangyonggan.extra.annotation.Monitor;

public class Demo11 {

    @Monitor(type = "redeem")
    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        hello("Monitor");
        hello("Monitor");
        hello("Monitor");
        hello("Monitor");
    }

}
