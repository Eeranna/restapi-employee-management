package corejava;

import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    Student() {}
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    Student1 s1 = new Student1();
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

    public String getM1() {
        return s1.getMyName();
    }

    public String getM2() {
        return s1.getMyName();
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getM1());
        System.out.println(s.getM2());
    }
}