package com.miaozc.pattern.prototype;

import java.util.ArrayList;

/**
 * 原型模式：一般用于创建对象逻辑较为繁琐，且易频繁创建对象的场景。用克隆的方式解决此问题。
 * Created by miaozc on 2019-4-20.
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype(new ArrayList<String>(),"tests");
        ConcretePrototype copy1 = (ConcretePrototype) prototype.clone();
        ConcretePrototype copy2 = (ConcretePrototype) prototype.deepClone();
        System.out.print("浅克隆对象是否相同：");
        System.out.println(prototype==copy1);
        System.out.print("深克隆对象是否相同：");
        System.out.println(prototype==copy2);

        System.out.print("浅克隆引用对象是否相同：");
        System.out.print(prototype.getList()==copy1.getList());
        System.out.println(prototype.getName()==copy1.getName());
        System.out.print("深克隆引用对象是否相同：");
        System.out.print(prototype.getList()==copy2.getList());
        System.out.println(prototype.getName()==copy2.getName());
        System.out.print("浅克隆引用值是否相同：");
        System.out.println(prototype.getName().equals(copy1.getName()));
        System.out.print("深克隆引用值是否相同：");
        System.out.println(prototype.getName().equals(copy2.getName()));
    }

}
