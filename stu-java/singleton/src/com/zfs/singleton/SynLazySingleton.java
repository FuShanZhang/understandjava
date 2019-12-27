package com.zfs.singleton;

/*懒汉模式的线程安全写法
    加synchronized关键字
    但是容易产生阻塞
 */
public class SynLazySingleton {

    private static SynLazySingleton instance;

    private SynLazySingleton(){}

    private static synchronized SynLazySingleton getInstance(){
        if(instance == null){
            instance = new SynLazySingleton();
        }
        return instance;
    }
}
