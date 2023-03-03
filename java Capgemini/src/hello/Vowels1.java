package hello;
import java.util.Scanner;
class Vowels1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0); 
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		 {
		  System.out.print("Entered character "+ch+" is "); 
		 }
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is ");
		else
		System.out.println("Not an alphabet"); 
		}
	
	}

