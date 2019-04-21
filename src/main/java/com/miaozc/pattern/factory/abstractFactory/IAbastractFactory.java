package com.miaozc.pattern.factory.abstractFactory;

import com.miaozc.pattern.factory.product.PhoneChargers.IPhoneChargers;
import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * 抽象工厂模式（Abastract Factory Pattern）是指提供一个创建一系列相关或相互依赖
 * 对象的接口，无须指定他们具体的类。
 *
 * 产品族 ^
 *       | 3 c 小
 *       | 2 b 中
 *       | 1 a 大
 *       ----------->
 *          （产品等级结构）
 *
 * 具体工厂<=>一个产品族(数字、字母、汉字)
 *
 * 产品等级结构<=>多个工厂
 * Created by miaozc on 2019-3-30.
 */
public interface IAbastractFactory {

    IPhoneChargers newPhoneChargers();

    IMobile newMobile();

}
