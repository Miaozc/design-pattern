package com.miaozc.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 优点：
 *      1.需要时才会创建，节省内存空间
 *      2.没有锁，执行效率高
 * 缺点：
 *      1.非线程安全
 *
 * Created by miaozc on 2019-3-30.
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance =null;

    public static synchronized LazySimpleSingleton getInstance(){
        if (instance ==null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }


}
