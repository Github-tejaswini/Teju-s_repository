package basic_Programs;

public class Calculate_Years_Weeks_Days {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int no_of_days = 373;
		
		System.out.println(no_of_days+ " No Of Days");
		
		int year = no_of_days / 365;
		System.out.println(year+ " Years Are There In "+no_of_days+ " No Of Days");
		
		int remaining_days = no_of_days % 365;
		
		int week = remaining_days / 7;
		System.out.println(week+ " Weeks Are There In "+ year+" Years And "+no_of_days+ " No Of Days");
		
		remaining_days =remaining_days % 7;
		System.out.println(remaining_days+" Remaining Days Are There In "+year+ " Years And "+week+ " Weeks And "+no_of_days+" No Of Days");
		
	}

}
