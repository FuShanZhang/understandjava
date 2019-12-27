package com.zfs.demo01;

/*
        静态代理模式总结：
            真实对象和代理对象都要实现同一接口
            代理对象要代理真实角色

        好处：
            代理对象可以做很多真实对象做不了的事
            真实对象专注做自己的事情
* */
public class Proxy {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "host=" + host +
                '}';
    }

    public void rent(){
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("收中介费");
    }

    public void heTong(){
        System.out.println("签租凭合同");
    }
}
