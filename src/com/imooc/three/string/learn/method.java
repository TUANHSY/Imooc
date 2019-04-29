package com.imooc.three.string.learn;

/**
 * @Author: duanxu
 * @Date: 2019/4/26 16:38
 *String的常用方法
 */
public class method {
    public static void main(String[] args) {
        String s1 = "duanzhaohuishixiaogou.text";
        StringBuffer s2 = new StringBuffer("aaaaasfdhhhhffdaaweaagreg");
        //获取字符串长度
        int l = s1.length();
        //查找字符第一次出现的位置'a'
        int f1 = s1.indexOf('.');
        //查找字符串第一次出现的位置"aba"
        int f2 =s1.indexOf("xiao");
        //查找字符串最后一次出现的位置
        int f3 = s1.indexOf(f1,'.');
        //
        System.out.println(l+" 000 "+f1+" 000  "+f2+"  000 "+f3);
        s2.append(5);
    }
    //获取字符串长度
    //查找字符第一次出现的位置'a'
    //查找字符串第一次出现的位置"aba"
    //查找字符串最后一次出现的位置
    //
}
