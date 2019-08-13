package com.miaozc.pattern.template;

/**
 * Created by miaozc on 2019-8-6.
 */
public abstract class AbstTemplateMethod {

    public void templateMethod1(int p){
        //抽象业务逻辑与模板逻辑灵活应用
        p = p+10;
        p = method1(p);
        print(p);
    }
    abstract int method1(int p);
    private void print(int p){
        System.out.println(p);
    }
}
