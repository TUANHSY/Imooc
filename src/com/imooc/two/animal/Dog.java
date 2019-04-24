package com.imooc.two.animal;

public class Dog extends Animal {
    public int age = 20 ;
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public Dog(){
        System.out.println("Dog类执行了");
    }

    public void method(){
        eat();
    }
    public String toString(){
        return "Dog[Dog's age = "+age+"\tDog's name ="+name+"]";
    }
    //重写equal方法
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj ==null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (age!=other.age)
            return false;
        if (name!= other.name)
            return false;
        return true;
    }
}
