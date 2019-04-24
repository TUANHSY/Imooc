package com.imooc.two.exercise;

public abstract class Car {
    //汽车名称
    private String carName;
    //日租金
    private float dailyRent;
    //是否载客
    private boolean passenger;
    //载客量
    private int CarryingCapacity;
    //是否载货
    private boolean cargo;
    //载货量
    private int cargoVolume;
    //是否已租出
    private boolean alreadyRentedOut;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public float getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(float dailyRent) {
        this.dailyRent = dailyRent;
    }

    public boolean isPassenger() {
        return passenger;
    }

    public void setPassenger(boolean passenger) {
        this.passenger = passenger;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public boolean isCargo() {
        return cargo;
    }

    public void setCargo(boolean cargo) {
        this.cargo = cargo;
    }

    public int getCarryingCapacity() {
        return CarryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        CarryingCapacity = carryingCapacity;
    }

    public boolean isAlreadyRentedOut() {
        return alreadyRentedOut;
    }

    public void setAlreadyRentedOut(boolean alreadyRentedOut) {
        this.alreadyRentedOut = alreadyRentedOut;
    }

    @Override
    public abstract String toString();
}
