package com.miaozc.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        QuestionEvent questionEvent = new QuestionEvent();
        questionEvent.setUserName("小明");
        questionEvent.setContent("观察者设计模式适用于哪些场景？");
        gper.publishQuestion(questionEvent);
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        EventBus eventBus = new EventBus();
        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(questionEvent);



    }

}
