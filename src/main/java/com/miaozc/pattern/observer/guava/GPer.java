package com.miaozc.pattern.observer.guava;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 * Created by Tom on 2019/3/17.
 */
public class GPer{

    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(QuestionEvent questionEvent){
        questionEvent.setgPerName(this.name);
        System.out.println(questionEvent.getUserName() + "在" + this.name + "上提交了一个问题。");
    }
}
