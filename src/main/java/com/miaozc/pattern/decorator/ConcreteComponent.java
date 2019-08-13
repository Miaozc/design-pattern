package com.miaozc.pattern.decorator;

/**
 * 具体构件
 * Created by miaozc on 2019-8-8.
 */
public class ConcreteComponent implements IComponent{
    @Override
    public void operation() {
        System.out.println("执行基本操作~");
    }
}
