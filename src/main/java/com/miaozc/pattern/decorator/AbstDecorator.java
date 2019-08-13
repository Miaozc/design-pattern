package com.miaozc.pattern.decorator;

/**
 * 抽象装饰类
 * Created by miaozc on 2019-8-8.
 */
public abstract class AbstDecorator implements IComponent{
    private IComponent component;

    public AbstDecorator(IComponent component) {
        this.component = component;
    }
    @Override
    public void operation() {
        System.out.println("执行抽象装饰");
        component.operation();
    }
}
