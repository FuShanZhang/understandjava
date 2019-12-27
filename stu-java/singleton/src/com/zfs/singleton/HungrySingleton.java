package com.zfs.singleton;
/*
    饿汉模式：线程安全 但是没有实现懒加载
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
