package com.imooc.two.exercise;

import java.util.Scanner;

public class Initial {
    public static final String head_1 ="----------------------------------------------------";
    public static final String head_2 ="****************************************************";
    public static Car[] initial(){
        Car car[] = new Car[6];
        car[0] = new Bus();
        car[1] = new Bus();
        car[2] = new Pickup();
        car[3] = new Bus();
        car[4] = new Truck();
        car[5] = new Truck();

        car[0].setCarName("奥迪");
        car[0].setDailyRent(500);
        car[0].setCarryingCapacity(4);

        car[1].setCarName("马自达");
        car[1].setDailyRent(500);
        car[1].setCarryingCapacity(4);

        car[2].setCarName("皮卡雪");
        car[2].setDailyRent(500);
        car[2].setCarryingCapacity(4);
        car[2].setCargoVolume(2);

        car[3].setCarName("金龙");
        car[3].setDailyRent(500);
        car[3].setCarryingCapacity(4);

        car[4].setCarName("松花江");
        car[4].setDailyRent(500);
        car[4].setCarryingCapacity(4);

        car[5].setCarName("依维柯");
        car[5].setDailyRent(500);
        car[5].setCarryingCapacity(4);
        return car;
    }

    public static void show(Car car[]){
        System.out.println(head_1);
        for (int i = 0;i<car.length;i++){
            System.out.println(" "+(i+1)+".  "+car[i].toString());
        }
        System.out.println(head_1);

    }

    public static void rentCar(int nun,Car car[]){
        Scanner in = new Scanner(System.in);

        for (int i = 0;i<nun;i++){
            System.out.println("输入第"+(i+1)+"辆车的编号（1--6）：");

            int k = in.nextInt();
            while (k!=0){

                if (k==1){
                    car[0].setAlreadyRentedOut(true);
                    break;
                }else if (k==2){

                    car[1].setAlreadyRentedOut(true);
                    break;
                }else if (k==3){
                    car[2].setAlreadyRentedOut(true);
                    break;
                }else if (k==4){
                    car[3].setAlreadyRentedOut(true);
                    break;
                }else if (k==5){
                    car[4].setAlreadyRentedOut(true);
                    break;
                }else if (k==6){
                    car[5].setAlreadyRentedOut(true);
                    break;
                }else {
                    System.out.println("输入有误，请重新输入序号（1——6）：");
                    k = in.nextInt();
                }
            }
        }
    }

    public static void calculationPrice(int num,int day,Car car[]){

        System.out.println(head_2 +"\n要租赁的车辆为：");
        for (int i = 0;i<car.length;i++){
            if (car[i].isAlreadyRentedOut()){
                System.out.println(" "+(i+1)+"."+car[i].toString());
            }
        }

        System.out.println(head_2 +"\n载客的车辆为：");
        for (int i = 0;i<car.length;i++){
            if (car[i].isAlreadyRentedOut()&&car[i].isPassenger()){
                System.out.println(" "+(i+1)+"."+car[i].toString());
            }
        }

        System.out.println(head_2 +"\n载货的车辆为：");
        for (int i = 0;i<car.length;i++){
            if (car[i].isAlreadyRentedOut()&&car[i].isCargo()){
                System.out.println(" "+(i+1)+"."+car[i].toString());
            }
        }
        float price = 0f;
        float totalPrice = 0f;
        for (int i = 0;i<car.length;i++){
            if (car[i].isAlreadyRentedOut()){
                price=price+car[i].getDailyRent();
            }
        }
        totalPrice = price*day;
        System.out.println(head_2 +"\n租车的总价格："+totalPrice+"元。"+ head_2);
    }
}
