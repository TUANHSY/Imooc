package com.imooc.two.objcet;

public class Initial {
    public static void main(String[] args) {
        Telphone phone1 = new CellPhone();
        Telphone phone2 = new SmartPhone();

        phone1.setCpu(4.0f);
        phone1.setPhoneName("iphone");
        phone1.setScreen(5.0f);

        phone2.setCpu(4.0f);
        phone2.setPhoneName("iphone");
        phone2.setScreen(5.0f);

        System.out.println(phone1+"\n"+phone2);
        if (phone1 != phone2) {
            System.out.println("!!!!!!!!!!!!");
        } else {
            System.out.println("============");
        }

        if (phone1.equals(phone2)){
            System.out.println("============");
        }else {
            System.out.println("!!!!!!!!!!!!");
        }
    }
}
