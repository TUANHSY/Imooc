package com.imooc.three.string.learn;

/**
 * @Author: duanxu
 * @Date: 2019/4/26 15:29
 */
public class test {
    public static void main(String[] args) {
        String s1 = "IMOOC";
        String s2 = "IMOOC";
        String s3 = "IMOOC";
        String s4 = new String("IMOOC");
        String s5 = new String("IMOOC");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s4==s5);
    }
}
