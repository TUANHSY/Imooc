package com.imooc.two.polymorphism.exercise;

public class Traffic {
    private int seat;
    private String way;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "seat=" + seat +
                ", way='" + way + '\'' +
                '}';
    }

//    public void show(){
//  }

}
