package com.imooc.two.exercise;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Initial initial = new Initial();
        Car car[] = initial.initial();
        Scanner in = new Scanner(System.in);
        System.out.println("\t欢迎使用达达租车系统\n\t您可以租赁的车辆如下表：");
        initial.show(car);
        System.out.println("是否需要租车（Y.是  N.否）：");
        String select = in.next();
        while (!select.equals("N")) {
            if (select.equals("Y")) {
                System.out.println("输入租赁车辆数量（1--100）：");
                int num = in.nextInt();
                while (num != 0) {
                    if (num >= 0 && num <= 100) {
                        initial.rentCar(num, car);
                        System.out.println("输入租赁天数（1--365）：");
                        int day = in.nextInt();
                        while (day != 0) {
                            if (day >= 1 && day <= 365) {
                                initial.calculationPrice(num, day, car);
                                break;
                            } else {
                                System.out.println("输入天数不合法，请重新输入（1--365）：");
                                day = in.nextInt();
                            }
                        }
                        break;
                    } else {
                        System.out.println("错误请重新输入（0--100）:");
                        num = in.nextInt();
                    }
                }
                break;
            } else {
                System.out.println("错误请重新输入（Y.是 N.否）:");
                select = in.next();
            }
        }
        System.out.println("欢迎下次光临！");
    }
}