package com.miaozc.pattern.strategy.pay;

import com.miaozc.pattern.strategy.Payment;

/**
 * 京东支付
 * Created by miaozc on 2019-8-4.
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    public double queryBalance(String uid) {
        return 500;
    }
}