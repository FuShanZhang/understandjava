package com.zfs.demo02;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;


    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "UserServiceProxy{" +
                "userService=" + userService +
                '}';
    }

    public void add(){
        log("add");
        userService.add();
    }

    public void delete(){
        log("delete");
        userService.delete();
    }

    public void update(){
        log("update");
        userService.update();
    }

    public void query(){
        log("query");
        userService.query();
    }


    //日志方法

    private void log(String msg){
        System.out.println("使用了" + msg + "方法");
    }

    //1.改动原有的业务代码，在公司是大忌！


}

