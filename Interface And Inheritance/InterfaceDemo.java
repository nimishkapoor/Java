interface Student{
	void doAssignments();
	void writeExams();
}
class Person implements Student{
	public void doAssignments(){
		System.out.println("Do Assignments.");
	}
	public void writeExams(){
		System.out.println("Write Exams.");
	}

}
class InterfaceDemo{
	public static void main(String[] args){
		Student s=new Person();
		s.doAssignments();
		s.writeExams(); 
	}
}