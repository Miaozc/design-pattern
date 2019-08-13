package com.miaozc.pattern.strategy.pay;

import com.miaozc.pattern.strategy.Payment;

/**
 * weixin支付策略
 * Created by miaozc on 2019-8-4.
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    public double queryBalance(String uid) {
        return 256;
    }
}