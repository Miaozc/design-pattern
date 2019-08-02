package com.miaozc.pattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by miaozc on 2019-8-2.
 * CGlib动态代理
 */
public class ExpressCompanyCGLibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz,Class[] argumentTypes, Object[] arguments) throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        if(argumentTypes==null){
            return enhancer.create();
        }else{
            return enhancer.create(argumentTypes, arguments);
        }

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object object = methodProxy.invokeSuper(o,objects);
        send();
        return object;
    }

    public void send(){
        System.out.println("cglib动态代理-快递公司发出快递！");
    }
}
