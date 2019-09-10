interface A{
	void show(int i);
}
/*class Xyz implements A{
	public void show(){
		System.out.println("Hello");
	}
}*/
public class LambdaDemo{
	public static void main(String args[]){
			//A obj =new Xyz()
			/*A obj =new A(){
				public void show()
				{
					System.out.println("Hello");
				}
			};*/
			A obj =(i)->
				{
					System.out.println("Hello "+i);
				}
			;
			obj.show(6);
	}
}