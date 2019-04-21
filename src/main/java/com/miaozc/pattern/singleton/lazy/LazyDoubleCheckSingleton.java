package com.miaozc.pattern.singleton.lazy;

/**
 * 同步锁懒汉单例
 * 优点：
 *      1.线程安全
 *      2.双重检查锁提高性能
 * 缺点:
 *      1.始终是有锁的
 * Created by miaozc on 2019-3-31.
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {
    }

    /**
     * volatile解释
     * 并发编程三大特性：可以保证可见性，能在一定程度上保证有序性，不能保证原子性
     * 功能：确保每一条线程读取的值都是主存的值，当一条线程进行值进行修改，
     *      会把其他线程的变量置为无效。等待该线程返回计算结果之后才能使用
     */

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton ==null){
            synchronized(LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton ==null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
