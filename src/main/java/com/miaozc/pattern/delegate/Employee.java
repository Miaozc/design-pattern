package com.miaozc.pattern.delegate;

/**
 * Created by miaozc on 2019-8-3.
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String doIt(String command){
        System.out.println(name+"正在做"+command+"工作");
        return "Done !";
    }
}
