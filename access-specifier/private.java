/* the var and method in class are private so
   it cannot be accessed by another class 
   it shows err in below code coz od accessin t
   he private from another class */


import java.util.*;
class privateClass {
	
	private static int i;
	private static void display(){
		
		i = 9;
		System.out.println(i);
	}
}

class Main{

	public static void main (String args[]){
	privateClass.display();
	System.out.println(privateClass.i);
	}
}

	
