package com.imooc.two.polymorphism.learn;

import java.util.Objects;
import java.util.Scanner;

public class Animal {
    private String name;
    private String fur;
    private int age;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("illegal age ,input again:");
            Scanner in = new Scanner(System.in);
            age = in.nextInt();
            setAge(age);
        }else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal can eat.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", fur='" + fur + '\'' +
                ", age=" + age +
                ", weight=" + weight +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Float.compare(animal.weight, weight) == 0 &&
                Objects.equals(name, animal.name) &&
                Objects.equals(fur, animal.fur) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fur, age, weight);
    }
}
