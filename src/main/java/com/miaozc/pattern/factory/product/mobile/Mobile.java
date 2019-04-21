package com.miaozc.pattern.factory.product.mobile;

import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class Mobile implements IMobile {

    public Mobile() {
        System.out.println("已生产一部手机");
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
