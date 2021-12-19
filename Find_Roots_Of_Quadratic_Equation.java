package basic_Programs;

public class Find_Roots_Of_Quadratic_Equation
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		double x1_root , x2_root;
	
		double a =3 , b=4 ,c=6;
		
		double determinant = (b* b)-(4 * a*c);
		double sqrt = Math.sqrt(determinant);
		
		if(determinant > 0)
		{
			x1_root =(- b + sqrt)/(2 * a);
			x2_root =(- b - sqrt)/(2 * a);
			
			System.out.println("Roots Are : "+x1_root + " And " +x2_root);
		}
		else if(determinant == 0)
		{
			System.out.println("Root Is : " +(-b + sqrt)/(2 *a));
		}
		else
		{
			System.out.println("Roots Are Not Possible");
		}

		 
		
		
	}
}
