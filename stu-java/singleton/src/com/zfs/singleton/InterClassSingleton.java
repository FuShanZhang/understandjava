package com.zfs.singleton;
/*
        HolderInnerStaticClass单例模式
        内部类常量实现了延迟加载和线程安全
        同时无锁使得性能最优(其实底层还是有锁)
 */
//final修饰防止类被继承
public final class InterClassSingleton {

    private InterClassSingleton(){}

    public static InterClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final InterClassSingleton INSTANCE = new InterClassSingleton();
    }


}
