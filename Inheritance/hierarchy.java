class Mango{

	static String s;
	static String mang(){
		s = "Mango : I love mango";	
		return new mang(s);
	}
}
class sweet_mango extends Mango{

	String s;
	void sweet(){
	
		s = "Sweet mango : I love sweet mango";
		System.out.println(s);	
	}
}

class sour_mango extends Mango{

	String s;
	String sour(){
	
		s = "Sour mango : I hate sour mango";	
		return(s);
	}
}

class fruit{

	public static void main (String args[]){

		sour_mango sour = new sour_mango();
		sweet_mango sweet = new sweet_mango();

		
		System.out.println(sour.mang());
		System.out.println(sour.sour());
		System.out.println(sweet.mang());
		sweet.sweet();

		System.out.println(Mango.mang());
	}
}


