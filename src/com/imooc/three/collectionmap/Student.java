package com.imooc.three.collectionmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: duanxu
 * @Date: 2019/4/28 18:31
 */
public class Student {
    public String id;
    public String name;
    public Set courses;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
        this.courses=new HashSet();
    }
}
