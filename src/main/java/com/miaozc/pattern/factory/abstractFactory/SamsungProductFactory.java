package com.miaozc.pattern.factory.abstractFactory;

import com.miaozc.pattern.factory.product.PhoneChargers.IPhoneChargers;
import com.miaozc.pattern.factory.product.PhoneChargers.SamsungPhoneCharagers;
import com.miaozc.pattern.factory.product.mobile.IMobile;
import com.miaozc.pattern.factory.product.mobile.SamsungMobile;

/**
 * Created by miaozc on 2019-3-30.
 */
public class SamsungProductFactory implements IAbastractFactory {
    @Override
    public IPhoneChargers newPhoneChargers() {
        return new SamsungPhoneCharagers();
    }

    @Override
    public IMobile newMobile() {
        return new SamsungMobile();
    }
}
