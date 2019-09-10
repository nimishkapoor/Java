abstract class vehicle{
	abstract void move();
}
class Car extends vehicle{
	void move(){
		System.out.println("Car Moving");
	}
}
class Ship extends vehicle{
	void move(){
		System.out.println("Ship moving");
	}
}
class AbstractDemo{
	void someMethod(vehicle v){
		v.move();
	}
	public static void main(String[] args){
		AbstractDemo ad=new AbstractDemo();
		vehicle v1=new Car();
		ad.someMethod(v1);
		vehicle v2= new Ship();
		ad.someMethod(v2);
	}
}