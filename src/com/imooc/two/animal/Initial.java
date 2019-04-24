package com.imooc.two.animal;

public class Initial {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "111";

        Dog dog1 = new Dog();
        dog1.age = 10;
        dog1.name = "111";

        if (dog.equals(dog)){
            System.out.println("==");
        }else {
            System.out.println("!=");
        }

        if (dog.equals(dog1)){
            System.out.println("==");
        }else {
            System.out.println("!=");
        }



      //  Animal animal = new Animal();
      //  animal.name = "大黄";

       // System.out.println(dog+"\n"+animal);
    }
}
