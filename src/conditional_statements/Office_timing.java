package conditional_statements;

public class Office_timing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch("office=10 am")
		{
		case "office=8 am" :{
			System.out.println("sign in");
			break;
		}
		case "office=9 am" :{
			System.out.println("tea time");
			break;
		}
		case "office=11 am" :{
			System.out.println(" breakfast");
			break;
		}
		case "office=2 pm":{
			System.out.println("Lunch time");
			break;
		}
		default :{
			System.out.println(" leave the office");
			break ;
		}
		}
	}
}


