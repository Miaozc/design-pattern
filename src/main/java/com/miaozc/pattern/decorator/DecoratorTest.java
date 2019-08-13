package com.miaozc.pattern.decorator;

/**
 * Created by miaozc on 2019-8-8.
 * 装饰者模式测试类
 */
public class DecoratorTest {
    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();
        IComponent d1 = new ConcreteDecorator(component);
        d1.operation();
    }
}
