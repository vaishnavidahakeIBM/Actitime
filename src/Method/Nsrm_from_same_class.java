package Method;

public class Nsrm_from_same_class  
{

	
public static void main(String[]args)

{
	System.out.println("main method is started");
	
	Nsrm_from_same_class s=new Nsrm_from_same_class();
	   s.M1();
	   s.M2();
	
	System.out.println("main method is ended");
}
	
	public void M1() //method declaration
	{
		System.out.println("i am fron m1 Nsrm"); //method implementation
	}
	public void M2()
	{
		System.out.println("i am fron m2 Nsrm");
	}
   
}