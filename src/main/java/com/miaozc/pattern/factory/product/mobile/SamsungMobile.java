package com.miaozc.pattern.factory.product.mobile;

import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class SamsungMobile implements IMobile {
    public SamsungMobile() {
        System.out.println("已生产一部三星手机");
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
