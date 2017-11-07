package com.kangyonggan.extra;

import com.kangyonggan.extra.annotation.Valid;

/**
 * @author kangyonggan
 * @since 11/7/17
 */
public class Person {

    @Valid(required = true)
    private String idcard;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idcard='" + idcard + '\'' +
                '}';
    }
}
