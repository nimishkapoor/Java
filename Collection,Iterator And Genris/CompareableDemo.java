import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st){
		if(age==st.age)
			return 0;
		if(age>st.age)
			return 1;
		else
			return -1;
	}
}
public class CompareableDemo{
	public static void main(String args[]){
		Student s1=new Student(101,"Vj",5);
		Student s2=new Student(205,"Aj",5);
		System.out.println(s1.compareTo(s2));
	}
}
