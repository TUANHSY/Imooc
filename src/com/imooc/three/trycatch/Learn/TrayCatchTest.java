package com.imooc.three.trycatch.Learn;

public class TrayCatchTest {
    public static int test(){
        int divider = 10;
        int resualt = 100;
        try {
            while (divider >-1){
                divider--;
                resualt = resualt +100/divider;
            }
            return resualt;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常");
            return -1;
        }
    }
    public static void main(String[] args) {
        int resualt = test();
        System.out.println(resualt);
    }
}
