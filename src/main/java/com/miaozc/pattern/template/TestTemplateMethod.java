package com.miaozc.pattern.template;

/**
 * Created by miaozc on 2019-8-6.
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        AbstTemplateMethod test = new TemplateMethod1();
        test.templateMethod1(10);
        test = new TemplateMethod2();
        test.templateMethod1(10);
    }
}
