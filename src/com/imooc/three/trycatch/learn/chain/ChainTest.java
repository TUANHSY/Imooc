package com.imooc.three.trycatch.learn.chain;

/**
 * @Author: duanxu
 * @Date: 2019/4/25 20:56
 */
public class ChainTest {
    public static void main(String[] args) {
        ChainTest ct = new ChainTest();
        try {
            ct.test_2();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("000000000000000000001");

    }
    public void test_1()throws DrunkException{
        System.out.println("00000000000000000000");
        throw new DrunkException("喝车别开酒");

    }

    public void test_2(){
        System.out.println("00000000000000000000");
        try{
            test_1();
        }catch (DrunkException e){
            RuntimeException newExc = new RuntimeException("司机");
            newExc.initCause(e);
            throw newExc;
        }
        System.out.println("00000000000000000000");
        try {
            test_1();
        } catch (DrunkException e) {
            RuntimeException newExc = new RuntimeException();
            e.printStackTrace();
            newExc.initCause(e);
        }
        System.out.println("00000000000000000000");
    }
}
