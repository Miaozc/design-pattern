package com.miaozc.pattern.proxy.dynamicproxy.jdkproxy.core;

import java.lang.reflect.Method;

/**
 *
 * Created by miaozc on 2019-8-13.
 */
public interface MyInvocationHandler {
    Object invoke(Object myProxy, Method method, Object[] args) throws Throwable;
}
