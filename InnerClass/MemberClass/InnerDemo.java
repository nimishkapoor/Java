public class InnerDemo{
	public static void main(String args[]){
		A obj =new A();
		A.B obj1=obj.new B();
		obj1.show();
			
		
	}	
}
class A{
	int rollno;
	String sname;
	class B{
		public void show(){
			System.out.println("Hello");
		}
	}
}