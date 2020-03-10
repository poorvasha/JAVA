import java.util.*;
class construct{
	int i ; 
	construct(){
		i=9;
	}
	construct( int a){
		i = 3;
	}
}
class consturctMain{
	
	public static void main (String args[]){
	
		construct obj = new construct(8);
		System.out.println(obj.i);
	}
}
