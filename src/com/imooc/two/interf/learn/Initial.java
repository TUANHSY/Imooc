package com.imooc.two.interf.learn;

public class Initial {
    public static void main(String[] args) {
    CellPhone phone_1 = new CellPhone();
    SmartPhone phone_2 = new SmartPhone();
    Psp psp = new Psp();
    System.out.println(phone_1.toString());
    System.out.println(phone_2.toString());
    System.out.println(psp.toString());

    phone_2.playGame();
    psp.playGame();

    IPlayGame ip_1 = new SmartPhone();
    IPlayGame ip_2 = new Psp();
    ip_1.playGame();
    ip_2.playGame();

    IPlayGame ip_3 = new IPlayGame() {
        @Override
        public void playGame() {
            System.out.println("匿名内部类使用游戏。");
        }
    };
    ip_3.playGame();

    IPlayGame ip_4 = new IPlayGame() {
        public void playGame(){
            System.out.println("-------------------------------------------------------");
        }
    };
    ip_4.playGame();
    }
}
