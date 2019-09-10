//Also called Nested
public class InnerDemoAnonymous{
	public static void main(String args[]){
		
		B obj1=new B(){
			public void show(){
				System.out.println("Hi");
			}
		};
		obj1.show();
			
		
	}	
}

class B{
	public void show(){
		System.out.println("Hello");
	}
}