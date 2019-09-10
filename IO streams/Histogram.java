import java.util.*;
import java.io.*;
public class Histogram{
	public static void main(String args[]){
		int[] arr=new int[101];
		int zc=0;
		try{
			FileReader f=new FileReader("marks.txt");
			BufferedReader b=new BufferedReader(f);
			arr[0]=Integer.parseInt(b.readLine());
			String c;
			while((c=b.readLine())!=null){

				int x=Integer.parseInt(c);
				if(x==0)
				{
					zc++;
				}
				else{	
					arr[x]++;
				}
			}				
		}catch(FileNotFoundException ffe){
			System.out.println("Make sure file exists.");
			System.exit(0);
		}catch(IOException ioe){
			System.out.println("This didnt worked.");
			System.exit(0);
		}
		
		
		
		int[] out=new int[10];
		for(int i=1;i<101;i++){
			if(arr[i]!=0){
				
					if(i%10==0){
						for(int k=0;k<arr[i];k++){
							out[((i-1)/10)]++;
						}
					}

					else{
						for(int k=0;k<arr[i];k++){
							out[i/10]++;
						}
					}
				
				
			}	
		}
		for(int i=0;i<zc;i++){
			out[0]++;
		}
		System.out.print("0-10   |");
			for(int j=0;j<out[0];j++){
				System.out.print("*");
			}
			System.out.println();
		for(int i=1;i<9;i++){
			System.out.print((	(i*10)+1)+"-"+((i*10)+10)+"  |");
			for(int j=0;j<out[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("91-100 |");
			for(int j=0;j<out[9];j++){
				System.out.print("*");
			}
			System.out.println();

	}
}