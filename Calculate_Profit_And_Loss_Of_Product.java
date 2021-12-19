package basic_Programs;

public class Calculate_Profit_And_Loss_Of_Product 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cost_price =3000 , selling_price= 5000;
		
		if((selling_price - cost_price) > 0)
		{
			System.out.println("The Profit From The Product You Get Is : "+(selling_price -cost_price));
		}
		else if((selling_price - cost_price) < 0)
		{
			System.out.println("The Loss From The Product You Get Is : "+(cost_price - selling_price));
		}
		else
		{
			System.out.println("It's A Breakeven i.e. No Profit No Loss");
		}
		
		
		
	}

}
