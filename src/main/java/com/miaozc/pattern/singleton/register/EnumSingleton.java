package com.miaozc.pattern.singleton.register;

/**
 * 注册式单例之枚举单例
 * 优点：
 *      1.线程安全
 *      2.反序列化也能获取单例
 * 缺点：
 *      1.暂无
 * Created by miaozc on 2019-3-31.
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
