package com.miaozc.pattern.observer;

/**
 * 发布订阅上下文
 * Created by miaozc on 2019-8-8.
 */
public class ObserveContext {
    private String name;
    public ObserveContext(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
