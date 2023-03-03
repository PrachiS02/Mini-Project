package hello;
import java.util.*;
public class FactorialNO1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,fact=1,n;
		System.out.print("Enter any no = ");
		n=sc.nextInt();
		for(a=1;a<=n;a++)
		{
			fact=fact*a;
		}
       System.out.println("Factorial  No = "+fact);
	}

}
