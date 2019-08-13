package com.miaozc.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by miaozc on 2019-8-8.
 */
public class ConcreteObserver implements Observer {
    private String name ;
    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ConcreteObservable observable = (ConcreteObservable) o;
        ObserveContext context = (ObserveContext) arg;
        System.out.println(name+"已接收到"+context.getName()+"的事件");
    }
}
