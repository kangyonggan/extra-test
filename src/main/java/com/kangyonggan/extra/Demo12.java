package com.kangyonggan.extra;

import com.kangyonggan.extra.annotation.Cache;
import com.kangyonggan.extra.annotation.Log;
import com.kangyonggan.extra.annotation.Monitor;

/**
 * @author kangyonggan
 * @since 11/13/17
 */
public class Demo12 {

//    @Log
//    @Cache(key = "xxx")
    @Monitor
    public static String hello(String name) {
        while (name != null) {
            System.out.println(name);
            if (name.equals("222")) {
                System.out.println("xxxxxxx");
                return name;
            }
        }

        System.out.println("xxx");
        return name;

    }

    public static void main(String[] args) {
        hello("111");
    }

}
