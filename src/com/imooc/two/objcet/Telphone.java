package com.imooc.two.objcet;

import java.util.Objects;

public abstract class Telphone {
    private String phoneName;
    private float cpu ;
    private float screen;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public abstract void call();
    public abstract void sentMassage();

    @Override
    public String toString() {
        return "Telphone{" +
                "phoneName='" + phoneName + '\'' +
                ", cpu=" + cpu +
                ", screen=" + screen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telphone telphone = (Telphone) o;
        return Float.compare(telphone.cpu, cpu) == 0 &&
                Float.compare(telphone.screen, screen) == 0 &&
                Objects.equals(phoneName, telphone.phoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneName, cpu, screen);
    }
}
