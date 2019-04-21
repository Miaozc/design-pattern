package com.miaozc.pattern.factory.product.mobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class HuaweiMobile implements IMobile {
    public HuaweiMobile() {
        System.out.println("已生产一部华为手机");
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
