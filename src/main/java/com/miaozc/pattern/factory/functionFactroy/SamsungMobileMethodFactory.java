package com.miaozc.pattern.factory.functionFactroy;

import com.miaozc.pattern.factory.product.mobile.IMobile;
import com.miaozc.pattern.factory.product.mobile.SamsungMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class SamsungMobileMethodFactory implements IMobileMethodFactory {
    @Override
    public SamsungMobile newMobile(Class<? extends IMobile> clazz) throws IllegalAccessException, InstantiationException {
        return (SamsungMobile)clazz.newInstance();
    }
}
