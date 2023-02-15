package corejava;

//Java Program to demonstrate the use of Java Comparator
import java.util.*;
import java.io.*;
class TestComparator{
    public static void main(String args[]){
        //Creating a list of students
        ArrayList<Student1> al=new ArrayList<Student1>();
        al.add(new Student1(101,"Vijay",23));
        al.add(new Student1(106,"Ajay",27));
        al.add(new Student1(105,"Jai",21));

        System.out.println("Sorting by Name");
        //Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
        //Traversing the elements of list
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
        //Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
        //Travering the list again
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}