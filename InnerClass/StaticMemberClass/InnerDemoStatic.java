//Also called Nested
public class InnerDemoStatic{
	public static void main(String args[]){
		
		A.B obj1=new A.B();
		obj1.show();
			
		
	}	
}
class A{
	int rollno;
	String sname;
	static class B{
		public void show(){
			System.out.println("Hello");
		}
	}
}