import java.util.*;
class Box<T>{
	private T t;
	public void set(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
}
public class GenFunDemo2{
	public static void main(String args[]){
		Box<Integer> integerBox=new Box<Integer>();
		Box<String> stringBox=new Box<String>();
		integerBox.set(new Integer(9));
		stringBox.set(new String("Hello World!"));
		System.out.println("Intval :"+integerBox.get());
		System.out.println("String :"+stringBox.get());
	}
}