package com.imooc.two.animal;

public class Animal {
    public int age = 10;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("动物吃东西");
    }
    public Animal(){
        System.out.println("Animal类执行了");
    }

    public String toString(){
        return "Animal[Animal's age ="+age+"\tAnimal's name ="+name+"]";
    }
}
