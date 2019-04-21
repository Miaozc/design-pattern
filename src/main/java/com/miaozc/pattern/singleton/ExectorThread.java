package com.miaozc.pattern.singleton;

import com.miaozc.pattern.singleton.register.ContainerSingleton;

/**
 * Created by miaozc on 2019-3-31.
 */
public class ExectorThread implements Runnable{

    public void run() {
//        LazySimpleSingleton lazySingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);

//        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
        ContainerSingleton containerSingleton  = (ContainerSingleton) ContainerSingleton.getBean(ContainerSingleton.class.getName());
        System.out.println(Thread.currentThread().getName()+":"+containerSingleton);
    }
}
