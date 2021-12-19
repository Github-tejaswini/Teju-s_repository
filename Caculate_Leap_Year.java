package basic_Programs;

public class Caculate_Leap_Year 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2200;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println(year+ " It's A Leap Year");
		}
		else
		{
			System.out.println(year+ " It's Not A Leap Year");
		}
	
	}
}
