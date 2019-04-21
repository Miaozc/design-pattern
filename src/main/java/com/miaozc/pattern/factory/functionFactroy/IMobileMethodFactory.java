package com.miaozc.pattern.factory.functionFactroy;

import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * 工厂方法模式（Fatory Method Pattern）是指定义一个创建对象的接口，但让实现这个
 * 接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。
 * Created by miaozc on 2019-3-30.
 */
public interface IMobileMethodFactory {
    IMobile newMobile(Class<? extends IMobile> clazz) throws IllegalAccessException, InstantiationException;
}
