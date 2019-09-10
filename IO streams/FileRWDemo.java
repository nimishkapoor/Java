import java.util.*;
import java.io.*;
class FileRWDemo{
	void writeFile(String msg)throws IOException{
		FileOutputStream fos=new FileOutputStream("test.txt");
		DataOutputStream dos=new DataOutputStream(fos);

		dos.writeUTF(msg);
		dos.close();
		fos.close();
	}
	String readFile()throws IOException{
		FileInputStream fis=new FileInputStream("test.txt");
		DataInputStream dis=new DataInputStream(fis);
		String s=(String)dis.readUTF();
		dis.close();
		fis.close();
		return s;
	}
	public static void main(String args[])throws IOException{
		FileRWDemo frd=new FileRWDemo();
		frd.writeFile("UDTA PUNJAB!!!");
		String s1=frd.readFile();
		System.out.println(s1);

	}
}