import java.util.*;
class SampleArray{
	public static void main(String[] args){
		int size;
		Scanner in=new Scanner(System.in);
		size=in.nextInt();
		int[] a=new int[size];
		
		for(int i=0;i<size;i--){
			try{
				a[i]=in.nextInt();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Its an Exception dude");
				System.exit(0);
			}
		}
		for(int i=0;i<size;i++){
			try{
			System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Its an Exception dude");
			}
		}
	}	
}