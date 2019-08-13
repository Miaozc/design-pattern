package com.miaozc.pattern.strategy;

/**
 * Created by miaozc on 2019-8-4.
 * 测试策略模式
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","20180311001000009",1233);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
