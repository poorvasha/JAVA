class Walk{

	String s;
	String slow(){
		s = "I can walk";
		return(s);
	}
	
	String slow (String str){
		s = str;
		return(s);
	}
}

class Exercise extends Walk{

	static String str = "I can't walk daily";	
	public static void main (String args[]){

		Exercise ex = new Exercise();
		
		System.out.println(ex.slow());
		System.out.println(ex.slow(str));
	}
}
	
