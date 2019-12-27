package com.zfs.singleton;

//双重锁模式
//性能较好
public class DoubleCheckSycSingleton {
    private volatile static DoubleCheckSycSingleton instance;//volatile防止重排序

    private DoubleCheckSycSingleton(){}

    public static DoubleCheckSycSingleton getInstance(){
        if(instance == null){//Lock is expensive 第一次延迟防止阻塞
            synchronized (DoubleCheckSycSingleton.class){
                if(instance == null){//第二次验证完成线程安全单例
                    instance = new DoubleCheckSycSingleton();
                }
            }
        }
        return instance;
    }
}
