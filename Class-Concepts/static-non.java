//played with static and non static

import java.util.*;
class sta
{
	static int c=12;
	static void display(int a , int b)
	{	
		 int c = a+b;
	}
	
}
class main{

	public static void main (String args[])
	{
		int a,b,ans;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		//sta ac = new sta();
		sta.display(a,b);
		System.out.println("the ans is :"  +sta.c);
		
	}
}
