package com.miaozc.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册式单例之容器缓存单例
 * 优点:
 *      1.对大量单例对象的创建很友好
 * 缺点：
 *      1.非线程安全(尚不理解为什么不安全)
 * Created by miaozc on 2019-3-31.
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static final Map<String,Object> instanceMap = new HashMap<>();

    public static final Object getBean(String className){
        if(className==null||"".equals(className.trim())) return null;
        synchronized(instanceMap){
            if (instanceMap.containsKey(className)){
                return instanceMap.get(className);
            }else{
                Object obj = null;
                try {
                    Class clazz = Class.forName(className);
                    obj = clazz.newInstance();
                    instanceMap.put(className,obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
                return obj;
            }
        }
    }
}
