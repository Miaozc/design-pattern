package com.miaozc.pattern.template;

/**
 * Created by miaozc on 2019-8-6.
 */
public class TemplateMethod2 extends AbstTemplateMethod{
    @Override
    int method1(int p) {
        System.out.print("templateMethod2 p=");
        return p+2;
    }
}
