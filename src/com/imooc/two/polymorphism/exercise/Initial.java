package com.imooc.two.polymorphism.exercise;

public class Initial {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Ship ship = new Ship();
        Plan plan = new Plan();

        bus.setSeat(40);
        bus.setWay("Land");
        System.out.println(bus.toString());
        bus.toString();
    }

}
