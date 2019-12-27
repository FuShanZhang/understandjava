package com.zfs.singleton;

/*懒汉模式:尽在调用getInstance时创建唯一实例
         实现了Lazy Loading即延迟加载
         但是线程不安全
 */
public class LazySingleton {

    //声明本类类型静态域
    private static LazySingleton instance;

    //让构造函数为private 这样该类就不会被实例化了
    private LazySingleton(){}

    //创建 SingleObject 的唯一对象
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
