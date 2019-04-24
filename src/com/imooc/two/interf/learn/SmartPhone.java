package com.imooc.two.interf.learn;

public class SmartPhone extends Telphone implements IPlayGame {
    public void call(){
        System.out.println("智能手机可以打电话。");
    }

    public void sentMassage(){
        System.out.println("智能手机可以发语音短信。");

    }

    public void playGame(){
        System.out.println("智能手机可以打游戏。");

    }
}
