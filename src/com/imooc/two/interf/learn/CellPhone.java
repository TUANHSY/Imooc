package com.imooc.two.interf.learn;

public class CellPhone extends Telphone {
    public void call(){
        System.out.println("普通手机可以打电话。");
    }

    public void sentMassage(){
        System.out.println("普通手机可以发短信。");
    }

    @Override
    public String toString() {
        return super.getPhoneName();
    }
}
