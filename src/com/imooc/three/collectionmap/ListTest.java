package com.imooc.three.collectionmap;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author: duanxu
 * @Date: 2019/4/28 18:37
 *
 */
public class ListTest {
/**
 *
 **/
    public List courseToSelect;
    public ListTest(){
        this.courseToSelect=new ArrayList();
    }
    /**
     *0000000000000000000000
     */
    public void add(){
        Course c1 = new Course("1","1234");
        courseToSelect.add(c1);
        Course temp  = (Course) courseToSelect.get(0);
        System.out.println("1111：id="+temp.id+",name="+temp.name);

        Course c2 = new Course("2","cc");
        courseToSelect.add(courseToSelect.size(),c2);
        temp  = (Course) courseToSelect.get(1);
        System.out.println("1111：id="+temp.id+",name="+temp.name);
    }

    public static void main(String[] args) {

        ListTest l1 = new ListTest();
        l1.add();
    }
}
