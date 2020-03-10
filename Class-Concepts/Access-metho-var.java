import java.util.*;
class access
{
	int c;
	void display(int a , int b)
	{
		c = a+b;
	}
	//System.out.println("the ans is :" , +c);
}
class main{

	public static void main (String args[])
	{
		int a,b,ans;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		access ac = new access();
		ac.display(a,b);
		ans = ac.c;
		System.out.println("the ans is :"  +ans);
	}
}
	
	
