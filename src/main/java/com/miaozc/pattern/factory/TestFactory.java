package com.miaozc.pattern.factory;

import com.miaozc.pattern.factory.abstractFactory.HuaweiProductFactory;
import com.miaozc.pattern.factory.abstractFactory.IAbastractFactory;
import com.miaozc.pattern.factory.abstractFactory.SamsungProductFactory;
import com.miaozc.pattern.factory.functionFactroy.HuaweiMobileMethodFactory;
import com.miaozc.pattern.factory.functionFactroy.IMobileMethodFactory;
import com.miaozc.pattern.factory.functionFactroy.SamsungMobileMethodFactory;
import com.miaozc.pattern.factory.product.mobile.HuaweiMobile;
import com.miaozc.pattern.factory.product.mobile.Mobile;
import com.miaozc.pattern.factory.product.mobile.SamsungMobile;
import com.miaozc.pattern.factory.simpleFactory.MobileSimpleFactory;

/**
 * Created by miaozc on 2019-3-30.
 */
public class TestFactory {

    public static void main(String s []) throws Exception {
        //简单工厂模式
        System.out.println("\n简单工厂模式 Start");
        MobileSimpleFactory mobileFactory = new MobileSimpleFactory();
        mobileFactory.newMobile(Mobile.class);
        //方法工厂模式
        System.out.println("\n方法工厂模式 Start");
        IMobileMethodFactory samsungMobileMethodFactory = new SamsungMobileMethodFactory();
        samsungMobileMethodFactory.newMobile(SamsungMobile.class);
        samsungMobileMethodFactory.newMobile(SamsungMobile.class);
        IMobileMethodFactory huaweiMobileMethodFactory = new HuaweiMobileMethodFactory();
        huaweiMobileMethodFactory.newMobile(HuaweiMobile.class);
        huaweiMobileMethodFactory.newMobile(HuaweiMobile.class);
        //抽象工厂模式
        System.out.println("\n抽象工厂模式 Start");
        IAbastractFactory huaweiProductFactory= new HuaweiProductFactory();
        huaweiProductFactory.newMobile();
        huaweiProductFactory.newPhoneChargers();
        IAbastractFactory samsungProductFactory= new SamsungProductFactory();
        samsungProductFactory.newMobile();
        samsungProductFactory.newPhoneChargers();

    }
}
