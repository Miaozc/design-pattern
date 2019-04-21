package com.miaozc.pattern.factory.abstractFactory;

import com.miaozc.pattern.factory.product.PhoneChargers.HuaweiPhoneCharagers;
import com.miaozc.pattern.factory.product.PhoneChargers.IPhoneChargers;
import com.miaozc.pattern.factory.product.mobile.HuaweiMobile;
import com.miaozc.pattern.factory.product.mobile.IMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class HuaweiProductFactory implements IAbastractFactory {
    @Override
    public IPhoneChargers newPhoneChargers() {
        return new HuaweiPhoneCharagers();
    }

    @Override
    public IMobile newMobile() {
        return new HuaweiMobile();
    }
}
