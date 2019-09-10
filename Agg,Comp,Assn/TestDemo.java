class  Manager{
	public Project oProject=new Project();

	ArrayList<Worker> Workers=new ArrayList<Worker>();
	public void Logon(SwipeCard obj){
		obj.Swipe(this);
	}
	public String GetManagerName(){
    	return "Shiv";
	}
	public double Salary;

	public void HowisTheManager(boolean Good){
		if(Good){
			oProject.IsSuccess=true;

		}
		else{
			oProject.IsSuccess=false;
		}
	}

}
class SwipeCard{
	public void Swipe(Manager obj){

	}
	public String MakeofSwipeCard(){
		return "c001";
	}
}
class Worker{
	public String WorkerName(){
		return "WorkerName"+" ";
	}
}
class Project{
	public boolean IsSuccess=false;

}
class TestDemo{
	public static void main(String args[]){
		Manager objManager=new Manager();
		SwipeCard objSwipe=new Swipe();

	}
}