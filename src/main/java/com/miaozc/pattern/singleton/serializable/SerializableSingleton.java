package com.miaozc.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * 序列化单例
 * 优点
 *      1.反序列化不会破坏单例
 * 缺点
 *      1.反序列化时其实创建了一个新的实例，只是返回了原来的单例实例
 *          所以频繁做此操作会造成很大的内存开销
 * Created by miaozc on 2019-3-31.
 */
public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {
    }
    public static final SerializableSingleton getInstance(){
        return  instance;
    }
    private Object readResolve(){
        return instance;
    }
}
