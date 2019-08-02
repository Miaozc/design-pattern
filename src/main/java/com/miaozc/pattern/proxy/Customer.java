package com.miaozc.pattern.proxy;

/**
 * Created by miaozc on 2019-8-2.
 * 顾客
 */
public class Customer implements ICustomer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String send() {
        System.out.println(this.name + "填写快递单");
        return null;
    }

}
