import java.util.*;
class Object{
	int oid;
	Object(int oid){
		this.oid=oid;
	}

}
class ObjectArray{
	public static void main(String[] args){
		Object[] oa=new Object[10];
		for(int i=0;i<10;i++){
			oa[i]=new Object(i+1);
		}
		System.out.println("Success.");
	}
}