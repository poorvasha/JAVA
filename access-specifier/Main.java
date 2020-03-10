package publicpack;
import java.util.*;

class publiClass{

	public static int i;
	public static void display(){
		
		i = 9;
		//System.out.println(i);
	}
}

public class Main{

	public static void main (String args[]){
	publiClass.display();
	System.out.println(publiClass.i);
	}
}
