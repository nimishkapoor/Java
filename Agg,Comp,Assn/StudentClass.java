 class Address{
 int streetnum;
 String city;
 String state;
 String country;
 Address(int street,String c,String st,String coun){
 	this.streetnum=street;
 	this.city=c;
 	this.state=st;
 	this.country=coun;
  }
 }
 class StudentClass{
 	int rollNum;
 	String studentName;
 	Address studentAddr;
 	StudentClass(int roll,String name,Address addr){
 		this.rollNum=roll;
 		this.studentName=name;
 		this.studentAddr=addr;
 	}
 	public static void main(String args[]){
 		Address ad =new Address(55,"Agra","UP","India");
 		StudentClass obj=new StudentClass(123,"Chatanya",ad);
 		System.out.println(obj.rollNum);
 		System.out.println(obj.studentName);
 		System.out.println(obj.studentAddr.streetnum);
 		System.out.println(obj.studentAddr.city);
 		System.out.println(obj.studentAddr.state);
 		System.out.println(obj.studentAddr.country);

 	}
 }