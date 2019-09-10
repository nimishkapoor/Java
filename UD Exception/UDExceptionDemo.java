import java.util.*;
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
} 
public class UDExceptionDemo{
	public static void main(String[] args)throws Exception{
		
		int x;
		Scanner in=new Scanner(System.in);
		
		//x=in.nextInt();
		try{
			 x=Integer.parseInt(args[0]);
			if(x<0)
			throw new MyException("Enter a no greater thaan 0.");			
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Give an CLInput.");
			System.exit(0);
		}catch(MyException me){
			System.out.println("Enter a no greater than 0.");
			System.exit(0);
		}catch(NumberFormatException nfe){
			System.out.println("Please enter a valid number");
			System.exit(0);
		}
		//x=Integer.parseInt(args[0]);
		/*try{
			if(x<0)
			throw new MyException("YEAH!");
		}catch(MyException me){
			System.out.println(me);
			System.exit(0);
		}*/
		System.out.println("Correct Input.");
		//System.out.println(args[1]);
	}
}