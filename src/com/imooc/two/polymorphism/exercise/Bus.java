package com.imooc.two.polymorphism.exercise;

public class Bus extends Traffic {

    @Override
    public String toString() {
        return "Bus{" +
                "seat=" + super .getSeat() +
                ", way='" + super.getWay() + '\'' +
                '}';
    }

    public void show(){

        System.out.println("Bus可载"+getSeat()+"人在"+getWay()+"行驶。");
    }
}
