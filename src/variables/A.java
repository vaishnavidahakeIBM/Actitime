package variables;

public class A {
	static int k;//declaration
	
	public static void main(String[]arg)
	{//reinilization concept
		int i=10;
		i=20;
		i=30;
		System.out.println(i);//30
		
		//Trying to print without declaration
		int j; //only declaration
		//System.out.println(j); //we have to initialize it
		
		//print global variable which is only declared
		System.out.println(k);//0
	}

}
