package com.miaozc.pattern.strategy;

/**
 * 支付渠道
 * Created by miaozc on 2019-8-4.
 */
public abstract class Payment {
    public abstract String getName();

    public abstract double queryBalance(String uid);

    public PayState pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功", "支付金额：" + amount);
    }


}
