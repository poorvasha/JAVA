import java.util.*;
class cal{
	//int a ,b, c;
	//String s;
	public static void main(String args[])
	{
		int a ,b,c,n;
		//String s;
		Scanner ad = new Scanner(System.in);
		a = ad.nextInt();
		b = ad.nextInt();
		System.out.print("enter 1 for add\n");
		System.out.print("enter 2 for sub\n");
		System.out.print("enter 3 for mul\n");
		System.out.print("enter 4 for div\n");
		n = ad.nextInt();
		//s = ad.nextLine();

		if( n == 1 )
		{
			c = a + b;
			System.out.print("the ans is:\n " +c);
		}
		else if(n == 2)
		{
			c = a - b;
			System.out.print("the ans is: \n" +c);
		}
		else if(n == 3)
		{
			c = a * b;
			System.out.print("the ans is: \n" +c);
		}
		else if(n == 4)
		{
			c = a / b;
			System.out.print("the ans is: " +c);
		}
		else
		{
			System.out.print("enter the correct operation");
		}


	}
}
