package com.imooc.two.exercise;

public class Bus extends Car {
    @Override
    public boolean isPassenger() {
        return true;
    }

    @Override
    public boolean isCargo() {
        return false;
    }

    @Override

    public String toString() {
        return getCarName()+"\t"+getDailyRent()+"元/天\t载人："+getCarryingCapacity()+"人";
    }
}
