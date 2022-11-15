package Method;

public class SRM_call_from_sameclass {
	public static void main(String[]arg)
	{
	//System.out.println("main method is started");
	
	v1();
	v2();
	v3();
	
	
	//System.out.println("main method is ended");
	

    }
	public static void v1()
	{
		System.out.println("i am running from regular method v1");
	}
	
	public static void v2()
	{
		System.out.println("i am running from regular method v2");
	}
	public static void v3()
	{
		System.out.println("i am running from regular method v3");
	}
}