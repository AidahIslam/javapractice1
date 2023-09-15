package package1;

public class class8practice {
	
	int wheel = 4;  //global, create inside class, that's global
	
	void travel () {
		class8practice honda1 = new class8practice();
		String color = "red"; // local variable, declared in method not in the class
		System.out.println(honda1.wheel);
		System.out.println("color red has" + " " + color.length() + " " + "characters");  
		//int l = color.length();		
		
	}
	
	int add() { //
		int a = 2;
		int b = 4;
		return a*b; 
	
		
	}

	public static void main(String[] args) { //can't create a method inside a method
		// TODO Auto-generated method stub
		class8practice honda2 = new class8practice();
		int wheel = 5; //local, don't need an object to access
		String color = "green";
		String shade = "dark";
		String combination = color + " " + shade;
		String combine = shade.concat(" " + color);
		boolean contains = combine.contains(color);
		int index = color.indexOf('n');
		
		System.out.println(honda2.wheel);
		System.out.println(wheel);
		System.out.println(honda2.add()); //accessing the instance method, after method ()
		honda2.travel();
		System.out.println("hello" + "world"); // strings can be combined with the plus sign
		System.out.println(color.toUpperCase()); //predefined method, change to upper case
		System.out.println(color.toLowerCase());
		System.out.println(combination);
		System.out.println(combine);
		System.out.println(contains+ " " + "it is" + " " + color);
		System.out.println(index);
		// example of user defined method 
		
	}

}
