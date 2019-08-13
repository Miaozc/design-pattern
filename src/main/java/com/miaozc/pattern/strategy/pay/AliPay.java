package com.miaozc.pattern.strategy.pay;

import com.miaozc.pattern.strategy.Payment;

/**
 * Ali支付算法策略
 * Created by miaozc on 2019-8-4.
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 900;
    }
}
