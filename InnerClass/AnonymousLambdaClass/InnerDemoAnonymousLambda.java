//Also called Nested
public class InnerDemoAnonymousLambda{
	public static void main(String args[]){
		
		B obj1=()->System.out.println("Hi");
		obj1.show();
			
		
	}	
}
@FunctionalInterface
interface B{//SAM-single abstract method
	public void show();
}