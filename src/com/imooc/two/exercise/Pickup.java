package com.imooc.two.exercise;

public class Pickup extends Car {
    private int CargoVolume;

    public int getCargoVolume() {
        return CargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        CargoVolume = cargoVolume;
    }

    @Override
    public boolean isPassenger() {
        return true;
    }

    @Override
    public boolean isCargo() {
        return true;
    }
    public String toString() {

        return getCarName()+"\t"+getDailyRent()+"元/天\t载人："+getCarryingCapacity()+"人，载货："+getCargoVolume()+"吨";
    }
}
