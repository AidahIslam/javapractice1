package package1;

public class class9practice { //public access modifier, class java syntax, class9practice name of the class
	public static int a = 6;
	int height;
	int age;
	String name;
	class9practice(int c, String d) {
		age = c;
		name = d;
		
	}
	class9practice(int e, int d) {
		age = e;
		height = d;
		
	}
	void personaldetails() {
		System.out.println("name" + " " + "is" + ":" + name);
		System.out.println("age" + " " + "is" + ":" + age);
	}
	int add() {
		a = age + height; 
		System.out.println(a); 
		return a;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class9practice constructor_default = new class9practice(20, "john");
		class9practice constructor_1 = new class9practice(13, "Aidah");
		class9practice constructor_2 = new class9practice(13, 7);
		constructor_default.personaldetails();
		constructor_1.personaldetails();
		System.out.println(constructor_2.add());
		constructor_2.add();
		
	
	}

}
