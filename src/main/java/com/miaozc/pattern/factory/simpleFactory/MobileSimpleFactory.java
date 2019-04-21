package com.miaozc.pattern.factory.simpleFactory;

import com.miaozc.pattern.factory.product.mobile.Mobile;

/**
 * 简单工厂模式（Simple Factory Pattern）是指由一个工厂对象决定创建出哪一种产品类的实例
 * 但它不属于 GOF，23 种设计模式
 * Created by miaozc on 2019-3-30.
 */
public class MobileSimpleFactory {
    public Mobile newMobile(Class<? extends Mobile> mobileClazz) throws IllegalAccessException, InstantiationException {
        return (Mobile) mobileClazz.newInstance();
    }
}
