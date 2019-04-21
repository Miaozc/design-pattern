package com.miaozc.pattern.factory.functionFactroy;

import com.miaozc.pattern.factory.product.mobile.HuaweiMobile;
import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class HuaweiMobileMethodFactory implements IMobileMethodFactory {
    @Override
    public HuaweiMobile newMobile(Class<? extends IMobile> clazz) throws IllegalAccessException, InstantiationException {
        return (HuaweiMobile) clazz.newInstance();
    }
}
