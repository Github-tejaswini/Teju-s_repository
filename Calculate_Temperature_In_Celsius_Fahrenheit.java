package basic_Programs;

public class Calculate_Temperature_In_Celsius_Fahrenheit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		float celsius = 23.5f ,fahrenheit =30;
		
		//To Calculate Temperature In Fahrenheit
		fahrenheit = (((celsius *9) /5 )+32);
		System.out.println("Temperature In Fahrenheit Is : "+fahrenheit);
		
		//To Calculate Temperature In Celsius
		celsius = (((fahrenheit -32)* 5) / 9);
		System.out.println("Temperature In Celsius Is : "+celsius);
		
	}

}
