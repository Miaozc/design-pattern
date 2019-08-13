package com.miaozc.pattern.proxy.dynamicproxy.jdkproxy;

import com.miaozc.pattern.proxy.dynamicproxy.jdkproxy.core.MyClassLoader;
import com.miaozc.pattern.proxy.dynamicproxy.jdkproxy.core.MyInvocationHandler;
import com.miaozc.pattern.proxy.dynamicproxy.jdkproxy.core.MyProxy;

import java.lang.reflect.Method;

/**
 * Created by miaozc on 2019-8-2.
 * 快递公司-动态代理发送快递
 */
public class ExpressCompanyJDKProxy implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object object)throws Exception{
        this.target = object;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(this.target,args);
        send();
        return object;
    }

    public void send(){
        System.out.println("jdk动态代理-快递公司发出快递！");
    }
}
