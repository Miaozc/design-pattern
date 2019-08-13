package com.miaozc.pattern.observer;

import java.util.Observable;

/**
 * 被观察者对象
 * Created by miaozc on 2019-8-8.
 */
public class ConcreteObservable extends Observable {
    /**
     * 发布一个事件
     */
    public void publishEvent(ObserveContext context){
        setChanged();
        System.out.println("发布一个事件"+context.getName());
        notifyObservers(context);
    }
}
