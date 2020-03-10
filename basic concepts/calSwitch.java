import java.util.*;
class calSwitch{

	public static void main (String args[])
	{
		int a ,b, c, n;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("enter 1 for add\n");
		System.out.print("enter 2 for sub\n");
		System.out.print("enter 3 for mul\n");
		System.out.print("enter 4 for div\n");
		n = sc.nextInt();
		
		switch(n) {

		case 1 : 
			c = a + b;
			System.out.print("the ans is:\n " +c);		
			break;
		case 2 :
			c = a - b;
			System.out.print("the ans is: " +c);
			break;
		case 3 :
			c = a * b;
			System.out.print("the ans is:\n " +c);		
			break;
		case 4 :
			c = a / b;
			System.out.print("the ans is:\n " +c);		
			break;
		case 5 :
			System.out.print("enter the crt value");		
			break;
		}
	}
}
