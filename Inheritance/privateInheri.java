
/* even through inheritance
   it is not possible for 
   private access specifier,
   It shows err
*/


import java.util.*;
class PrivateAccount {
	
	private static int i;
	private static void display(){
		
		i = 9;
		System.out.println(i);
	}
}

class Insta extends PrivateAccount{

	public static void main (String args[]){
	Insta in = new Insta();
	in.display();
	System.out.println(in.i);
	}
}

	
