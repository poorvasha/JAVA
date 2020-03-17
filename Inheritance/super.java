/*  ---------------------------------------------------- Constructor ------------------------------------------------*/
// multilevel inheritance to access class 1 from class 2

class Super{
	Super(){
		System.out.println("I am super");
	}
}

class Better extends Super{
	Better(){
		super();
	}
}

class Worst extends Better{
	Worst(){
		super();
		//Better ob = new Better();
	}
	public static void main (String args[]){
		
		Worst obj = new Worst();
		
	}
}

/*  ---------------------------------------------------- Method ------------------------------------------------*/
// multilevel inheritance similar to above using method

class Super{
	void Supermethod(){
		System.out.println("I am super");
	}
}

class Better extends Super{
	void Bettermethod(){
		super.Supermethod();
	}
}

class Worst extends Better{
	void Worstmethod(){
		super.Bettermethod();
		//Better ob = new Better();
	}
	public static void main (String args[]){
		
		Worst obj = new Worst();
		obj.Worstmethod();
	}
}

/*  ---------------------------------------------------- Variable ------------------------------------------------*/
// multilevel inheritance similar to above using variable

class Super{
	int i = 7;
}

class Better extends Super{
	void Bettermethod(){
		System.out.println("my grade is " +super.i+ " but still am Super");
	}
}

class Worst extends Better{
	void Worstmethod(){
		super.Bettermethod();
		//Better ob = new Better();
	}
	public static void main (String args[]){
		
		Worst obj = new Worst();
		obj.Worstmethod();
	}
}