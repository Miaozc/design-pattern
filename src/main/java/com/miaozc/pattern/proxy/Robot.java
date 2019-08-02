package com.miaozc.pattern.proxy;

/**
 * Created by miaozc on 2019-8-2.
 * 机器人去寄快递
 */
public class Robot implements ICustomer {
    private String name ;

    public Robot(String name) {
        this.name = name;
    }

    public Robot() {
    }

    @Override
    public String send() {
        if (this.name==null||"".equals(this.name.trim())){
            System.out.println("无名智能机器人填写快递单");
        }else{
            System.out.println("智能机器人"+name+"填写快递单");
        }
        return null;
    }
}
