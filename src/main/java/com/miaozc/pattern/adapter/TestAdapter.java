package com.miaozc.pattern.adapter;

/**
 * Created by miaozc on 2019-8-6.
 * 测试适配器模式
 */
public class TestAdapter {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
