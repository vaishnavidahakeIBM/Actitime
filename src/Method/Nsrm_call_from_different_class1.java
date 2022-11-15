package Method;

public class Nsrm_call_from_different_class1 
{ //user logic class
	
public static void main(String[]args)
{
System.out.println("main method started");

Nsrm_call_from_different_class2  A=new Nsrm_call_from_different_class2();
       A.m1();
       A.m2();


System.out.println("main method ended");

}
}