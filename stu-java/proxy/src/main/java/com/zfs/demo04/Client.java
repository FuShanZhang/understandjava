package com.zfs.demo04;

import net.sf.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Host.class);
        enhancer.setCallback(new CglibProxyInterceptor());
        Rent rent = (Rent)enhancer.create();
        rent.rent();
    }
}
