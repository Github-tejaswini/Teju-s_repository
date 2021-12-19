package basic_Programs;

public class Area_Of_Circle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Using Typecasting Also
		
		//One way for PI Value You can use float or double
		
		
		float radius = 12,perimeter;
		
		double area = (double) (3.14*(radius *radius));
		
		System.out.println("Area Of Circle Is : "+area);
		System.out.println();
		
		perimeter = (float) (2 * (3.14) *radius);
		 
		System.out.println("Perimeter Of Circle Is : "+perimeter);
		System.out.println();

		//Another Way for PI Value
		 area =(int) (Math.PI * (radius* radius));
		System.out.println("Area Of Circle Is : "+area);
		
		
		
	}

}
