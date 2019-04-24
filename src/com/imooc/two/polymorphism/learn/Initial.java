package com.imooc.two.polymorphism.learn;

public class Initial {

    public static void main(String[] args) {

        //引用的多态
        Animal animal1 = new Animal();//创建自身对象
        Animal animal2 = new Dog();//创建子类对象
        Object obj1 = new Animal();//创建子类对象
        Object obj2 = new Dog();//创建子类的子类对象

        animal1.setAge(8);
        animal1.setFur("blue");
        animal1.setName("Jake");
        animal1.setWeight(35.5f);
        animal1.toString();

        animal2.setAge(8);
        animal2.setFur("blue");
        animal2.setName("Jake");
        animal2.setWeight(35.5f);
        animal2.toString();

        if (animal1.equals(animal2)){
            System.out.println("==========================");
        }else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        animal1.eat();
        animal2.eat();
        ((Dog) animal2).bark();
    }
}
