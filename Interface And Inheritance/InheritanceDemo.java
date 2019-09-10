import java.io.*;
import java.util.*;
class Student{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	void attendClasses(){
		System.out.println("Student attending classes.");
	}
	void doAssignments(){
		System.out.println("Student doing classes.");
	}
}
class ClassRep extends Student{
	int noofstudents;
	ClassRep(int rollno,String name,int noofstudents){
		super(rollno, name);
		this.noofstudents=noofstudents;
	}
	void doAssignments(){
		System.out.println(super.name);
		System.out.println(this.noofstudents);
		System.out.println("ClassRep doing Assignments.");
	}
	void mantainClassregister(){
		System.out.println("Maintaining Class register.");
	}

}
class InheritanceDemo{
	Student findnoofabsentees(int present){
		ClassRep s=new ClassRep(777,"kam",963);
		s.noofstudents=s.noofstudents-present;
		return s;

	}
	public static void main(String[] args){
		Student s=new Student(48,"sam");
		ClassRep cr=new ClassRep(49,"dam",70);
		s.attendClasses();
		s.doAssignments();
		cr.attendClasses();
		cr.doAssignments();
		cr.mantainClassregister();

		Student t=new ClassRep(202,"van",70);
		t.doAssignments();

		Student t1=new InheritanceDemo().findnoofabsentees(50);
		System.out.println(t1.name);
		//t.mantainClassregister();
	//	ClassRep cr2=new Student(619,"bam"); Not possible.
	}
}