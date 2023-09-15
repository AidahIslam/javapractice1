package package1;

public class methodtype {
	public static int wheel = 4;  
	public static methodtype honda;
	
	public void travel() { // if not sharing, then doesn't matter whether it's public or private
		 // if we create an object for a class, it matters where it's created
	} //if create object inside a method, it'll be valid for that method, but if create a object outside of the method, under class, then it'll work for everything. 
	
	
	
	public static void add() {
		  System.out.println(2+3); //this is what you're going to do/ instruction
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wheel);
		add(); // this is for (2+2), so if we put static, we don't need any object
		honda = new methodtype();
		honda.add();
		
	}

}
