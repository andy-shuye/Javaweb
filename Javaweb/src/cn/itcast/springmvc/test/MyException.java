package cn.itcast.springmvc.test;

public class MyException extends Exception {
    String msg;
    MyException(int age) {
        msg="age can not be positive!";
    }
    public String toString() {
        return msg;
    }
}
