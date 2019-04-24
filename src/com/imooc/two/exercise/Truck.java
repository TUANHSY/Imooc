package com.imooc.two.exercise;

public class Truck extends Car {
    @Override
    public boolean isPassenger() {
        return false;
    }

    @Override
    public boolean isCargo() {
        return true;
    }
    public String toString() {
        return getCarName()+"\t"+getDailyRent()+"元/天\t载货："+getCarryingCapacity()+"吨";
    }
}
