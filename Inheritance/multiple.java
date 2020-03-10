class Grandpa{

	static String s;
	static String grand(){
	
		s = "Grandpa Age : 80";	
		return(s);
	}
}

class Father extends Grandpa{

	static String s;
	static String father(){
	
		s = "Father Age : 40";	
		return(s);
	}
}
class Son extends Father{

		 static String s;
		 static String son(){
		
			s = "Son Age : 20";	
			return(s);
		}
		
	public static void main (String args[]){

		Son so = new Son();

		System.out.println(son());
		System.out.println(so.father());
		System.out.println(so.grand());
	}
}

