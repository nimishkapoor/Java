import java.util.*;
import java.io.*;
class Student implements Serializable{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}
public class ObjectStreamDemo{
	void writeObj(Student x)throws IOException{
		FileOutputStream fis=new FileOutputStream("student.obj");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(x);
		fis.close();
		ois.close();
	}
	Student readObj()throws IOException,ClassNotFoundException{
		FileInputStream fos=new FileInputStream("student.obj");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Student x=(Student)oos.readObject();
		fos.close();
		oos.close();
		return x;
	}
	public static void main(String args[])throws IOException,ClassNotFoundException{
		ObjectStreamDemo osd=new ObjectStreamDemo();
		Student s=new Student(12,"sam");
		osd.writeObj(s);
		Student s1=osd.readObj();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
	}

}
