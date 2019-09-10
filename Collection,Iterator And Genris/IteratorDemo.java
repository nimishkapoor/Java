import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo{
	public static void main(String args[]){
		ArrayList names =new ArrayList();
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Jack");
	
		Iterator it = names.iterator();
		while(it.hasNext()){
			String obj =(String)it.next();
			System.out.println(obj);
		}	
	}

}
/* Constructor Summary
ArrayList()
          Constructs an empty ArrayList.
ArrayList(Collection c)
          Constructs an ArrayList containing the elements of the specified Collection, in the order they are returned by the Collection's iterator.
ArrayList(int initialCapacity)
          Constructs an empty ArrayList with the specified initial capacity.
 
Method Summary
 void 	add(int index, Object element)
          Inserts the specified element at the specified position in this ArrayList.
 boolean 	add(Object o)
          Appends the specified element to the end of this ArrayList.
 boolean 	addAll(Collection c)
          Appends all of the elements in the specified Collection to the end of this this ArrayList, in the order that they are returned by the specified Collection's Iterator.
 boolean 	addAll(int index, Collection c)
          Inserts all of the elements in the specified Collection into this ArrayList, starting at the specified position.
 void 	clear()
          Removes all of the elements from this ArrayList.
 Object 	clone()
          Returns a shallow copy of this ArrayList.
 boolean 	contains(Object elem)
          Returns true if this ArrayList contains the specified element.
 void 	ensureCapacity(int minCapacity)
          Increases the capacity of this ArrayList, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.
 Object 	get(int index)
          Returns the element at the specified position in this ArrayList.
 int 	indexOf(Object elem)
          Searches for the first occurence of the given argument, testing for equality using the equals method.
 boolean 	isEmpty()
          Tests if this ArrayList has no components.
 int 	lastIndexOf(Object elem)
          Returns the index of the last occurrence of the specified object in this ArrayList.
 Object 	remove(int index)
          Removes the element at the specified position in this ArrayList.
 Object 	set(int index, Object element)
          Replaces the element at the specified position in this ArrayList with the specified element.
 int 	size()
          Returns the number of components in this ArrayList.
 Object[] 	toArray()
          Returns an array containing all of the elements in this ArrayList in the correct order.
 Object[] 	toArray(Object[] a)
          Returns an array containing all of the elements in this ArrayList in the correct order.
 void 	trimToSize()
          Trims the capacity of this ArrayList to be the ArrayList's current size. */