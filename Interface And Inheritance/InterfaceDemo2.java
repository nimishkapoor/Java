interface One{
	void someMethod();
}
interface Two{
	void someMethod();
}
class Sample implements One,Two{
	public void someMethod(){
		System.out.println("This seems to be working.");
	}
}
class InterfaceDemo2{
	public static void main(String[] args){	
		Sample s=new Sample();
		One o=new Sample();
		Two t=new Sample();
		s.someMethod();
		o.someMethod();
		t.someMethod();
	}
}