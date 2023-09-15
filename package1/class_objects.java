package package1;

public class class_objects {
	int num1 = 5;
	int num2 = 10;
	int age = 25;
	String name = "Aidah";
	String city = "kennesaw";
	
	void sum() {
		System.out.println("hello world");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_objects obj = new class_objects();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.city);
		System.out.println(obj.name +"\n"+obj.age+"\n"+obj.city ); ///n to make separate lines. 
		
     }

}
