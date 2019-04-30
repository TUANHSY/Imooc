package com.imooc.three.collectionmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
     *添加courses
     */
    public void add(){

        Course c1 = new Course("1","数据结构");
        courseToSelect.add(courseToSelect.size(),c1);
        Course temp  = (Course) courseToSelect.get(courseToSelect.size()-1);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);

        Course c2 = new Course("2","c语言");
        courseToSelect.add(courseToSelect.size(),c2);
        temp  = (Course) courseToSelect.get(courseToSelect.size()-1);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);

        Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
        courseToSelect.addAll(courseToSelect.size(), Arrays.asList(courses));
        temp =(Course) courseToSelect.get(courseToSelect.size()-2);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);
        temp =(Course) courseToSelect.get(courseToSelect.size()-1);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);

        Course[] courses2 = {new Course("5","高等数学"),new Course("6","大学英语")};
        courseToSelect.addAll(courseToSelect.size(), Arrays.asList(courses2));
        temp =(Course) courseToSelect.get(courseToSelect.size()-2);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);
        temp =(Course) courseToSelect.get(courseToSelect.size()-1);
        System.out.println("课程：id= "+temp.id+"，name= "+temp.name);
    }
/**
* 迭代器取list元素
 * */
    public void testIterator(){
        Iterator it =courseToSelect.iterator();
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程：id= "+cr.id+"，name= "+cr.name);
        }
    }
    /**
     * foreach取list元素
     */
    public  void testForeach(){
        for (Object o:courseToSelect){
            Course c = (Course)o;
            System.out.println("课程：id= "+c.id+"，name= "+c.name);
        }
    }

    /**
     * for取list元素
     */
    public void testGet(){
        System.out.println("待选课程如下：");
        for (int i = 0;i<courseToSelect.size();i++){
            Course c = (Course)courseToSelect.get(i);
            System.out.println("课程：id= "+c.id+"，name= "+c.name);
        }
    }

    public static void main(String[] args) {

        ListTest l1 = new ListTest();
        l1.add();
        //l1.testGet();
      //  l1.testIterator();
        l1.testForeach();
    }
}
