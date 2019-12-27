package com.zfs.demo04;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyInterceptor implements MethodInterceptor {


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        seeHouse();
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }

    public void seeHouse(){
        System.out.println("看房子");
    }
}
