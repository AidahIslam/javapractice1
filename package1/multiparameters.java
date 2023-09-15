package package1;

public class multiparameters {

	public static int a = 6;
	int height;
	int age;
	String name;
	String address;
	double salary;
	multiparameters(int c, String d) {
		age = c;
		name = d;
		
	}
	multiparameters(int e, int d) {
		age = e;
		height = d;
		
	}
	multiparameters(int f, int g, String h) {
		age = f;
		height = g;
		address = h;
	}	
	multiparameters(int i, int j, String k, double l) {
		age = i;
		height = j;
		address = k;
		salary = l; 
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
		multiparameters constructor_default = new multiparameters(20, "john");
		multiparameters constructor_1 = new multiparameters(13, "Aidah");
		multiparameters constructor_2 = new multiparameters(13, 7);
		multiparameters constructor_2 = new multiparameters(13, 7, "1400 Bay DR", 45000.15 );
		
		
		constructor_default.personaldetails();
		constructor_1.personaldetails();
		System.out.println(constructor_2.add());
		constructor_2.add();

	}

}
