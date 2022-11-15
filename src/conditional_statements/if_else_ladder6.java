package conditional_statements;

public class if_else_ladder6 {

	public static void main(String[] args) {
		int zerox_pages=50;
		if(zerox_pages>=100)
		{
			System.out.println("in 1st 100 pages rate should be 1 rupees");
			
		}
		else if(zerox_pages>=90 )
		{
			System.out.println("after 100 pages rate should be 1.5 rupees");
	    }
	else if(zerox_pages>=70)
	    {
		
	System.out.println("after 100 pages rate should be 2 rupees");
		}
	else
	{
		System.out.println(" Below 100 pages rate should be 5 rupees");
	}
	
}
}
