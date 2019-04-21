package com.miaozc.pattern.singleton.lazy;

/**
 * 内部类单例(推荐的一种实现方式)
 * 优点：
 *      1.避免了饿汉式的内存浪费
 *      2.线程安全且不需要加synchronized,执行效率高，无线程阻塞问题
 * 缺点：
 *      1.暂无
 * Created by miaozc on 2019-3-31.
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        System.out.println("构造方法");
        if (LazyHolder.LAZY!=null){
            throw new RuntimeException("禁止通过反射创建此单例对象");
        }
    }
    public static final LazyInnerClassSingleton getInstance(){
        System.out.println("getInstance");
        return LazyHolder.LAZY;
    }
    public static String a = staticMethod();

    static {
        System.out.println("Static Block");
    }

    private static String staticMethod() {
        System.out.println("static Field");
        return "";
    }


    /**
     * 内部类一定是要在方法调用之前初始化，巧妙地避免了线程安全问题。
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY= new LazyInnerClassSingleton();
    }
    public static void main(String []s ){
        LazyInnerClassSingleton.getInstance();
    }
}
