package com.miaozc.pattern.strategy.pay;

import com.miaozc.pattern.strategy.Payment;

/**
 * 银联支付策略
 * Created by miaozc on 2019-8-4.
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    public double queryBalance(String uid) {
        return 120;
    }
}