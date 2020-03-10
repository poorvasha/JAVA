public class methodRide{

	static String s;
	static String type(){
		s = "type2 : male";
		return(s);
	}
}
class Human extends Gender{
	
	 String s;
	 String type(){
		s = "type1 : Female";
		return(s);
	}

	public static void main (String args[]){

		Human hum = new Human();
		
		System.out.println(hum.type());
		System.out.println(methodRide.type());
		
	}
}

	
	



	
