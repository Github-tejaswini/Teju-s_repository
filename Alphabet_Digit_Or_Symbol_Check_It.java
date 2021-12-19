package basic_Programs;

public class Alphabet_Digit_Or_Symbol_Check_It {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		char ch = 'a';
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("It's Alphabet");
		}
		else if(ch >= '0' &&  ch <= '9')
		{
			System.out.println("It's Digit");
		}
		else
		{
			System.out.println("It's Special Character/ Symbol");
		}
		
	}

}
