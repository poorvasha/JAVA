
class single {

	 String s;
         String reason(){
		
		s = "dad's girl";
		return(s);
	}
}
class girl extends single{
	
	public static void main (String args[]){
		
		girl obj = new girl();
		
		System.out.println(obj.reason());
	}
}
		
