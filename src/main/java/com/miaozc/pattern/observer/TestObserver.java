package com.miaozc.pattern.observer;

/**
 * 测试观察者
 * Created by miaozc on 2019-8-8.
 */
public class TestObserver {
    public static void main(String[] args) {
        ObserveContext context = new ObserveContext("Event 1");
        ConcreteObservable observable =new ConcreteObservable();
        ConcreteObserver observer = new ConcreteObserver("观察者一号");
        ConcreteObserver observer2 = new ConcreteObserver("观察者二号");
        observable.addObserver(observer);
        observable.addObserver(observer2);
        observable.publishEvent(context);
    }
}
