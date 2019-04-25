package com.imooc.three.trycatch.learn;

public class TrayCatchTest {
    public static int test(){
        int divider = 10;
        int result = 100;
        try {
            while (divider >-1){
                divider--;
                result = result +100/divider;
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("test()抛出异常");

        }finally{
            System.out.println("最终执行了finally:"+result);
            return 1111;
        }
    }
    public static void main(String[] args) {
        int result = test();
        System.out.println("test()执行完毕 返回值为："+result);
    }
}
