package com.miaozc.pattern.decorator;

/**
 * 具体装饰
 * Created by miaozc on 2019-8-8.
 */
public class ConcreteDecorator extends AbstDecorator {
    public ConcreteDecorator(IComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        method1();
        super.operation();
    }

    public void method1(){
        System.out.println("执行附加的装饰方法");
    }
}
