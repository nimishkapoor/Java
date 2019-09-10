import java.util.*;
class Test<T>{
	T a;
	T b;
	public void set(T a,T b){
		this.a=a;
		this.b=b;
	}
	public T geta(){
		return a;
	}
	public T getb(){
		return b;
	}
}
public class GenFunDemo{
	public static void main(String[] args){
		Test<Integer> t1=new Test<Integer>();
		t1.set(new Integer(5),new Integer(6));
		System.out.println("Sum :"+(t1.getb()+t1.geta()));
	}
}