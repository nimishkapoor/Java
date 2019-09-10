import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2{
	public static void main(String args[]){
		ArrayList<String> names =new ArrayList<String>();
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Jack");
		//names.add(new Integer(10));

		Iterator<String> it = names.iterator();

		while(it.hasNext()){
			String obj =it.next();
			System.out.println(obj);
		}	
	}

}