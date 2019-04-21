package com.miaozc.pattern.singleton.threadLocal;

/**
 * 线程单例
 * 优点：
 *      1.ThreadLocal 不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全
 * 缺电：
 *      1.多线程则为非线程安全
 * Created by miaozc on 2019-3-31.
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
