package com.miaozc.pattern.singleton.hungry;

/**
 * 饿汉式单例
 *
 * 优点：
 *      1.代码逻辑简单
 *      2.线程安全
 * 缺点：
 *      1.始终占用内存，性能差
 * Created by miaozc on 2019-3-30.
 */
public class HungrySingleton {
    //法1
    private static final HungrySingleton instance = new HungrySingleton();
    //法2
//    static {
//        instance = new HungrySingleton();
//    }
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return instance;
    }
}
