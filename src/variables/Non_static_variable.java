package variables;

public class Non_static_variable {
	static int i=10; //static global variable
	int j=20; //non static global variable
	

	public static void main(String[] args) {
		System.out.println(i);// static global variable can be directly print
		
		Non_static_variable s= new Non_static_variable(); //for non static global variable we need to delclare class
		System.out.println(s.j);
		// above is the method of declaing class

	}

}
