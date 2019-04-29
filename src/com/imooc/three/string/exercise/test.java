package com.imooc.three.string.exercise;

import java.util.Scanner;

/**
 * @Author: duanxu
 * @Date: 2019/4/28 10:43
 * 判断Java文件名格式
 * 判断邮箱格式
 */
public class test {
    public static void main(String[] args) {
        String fileName ;
        String email;
        Scanner in = new Scanner(System.in);

        fileName=in.next();
        int l = fileName.length();
        int i = fileName.indexOf('1');
        char a = fileName.charAt(i+1);
        byte b[] = fileName.getBytes();
        for (int j = 0;i<b.length;j++){
            System.out.println(b[j]+" ");
        }
        String s1 = fileName.substring(fileName.indexOf('.')+1);
        System.out.println(fileName.toUpperCase()+"\tlength:"+l+"\tposition of dot:"+(i+1)+"\tlast name:"+s1+"   "+a);
        email=in.next();
    }
}
