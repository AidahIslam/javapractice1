package package1;

public class datatype {
	
	int age = 20; // integer is positive or negative value of a whole number
	public static double Height = 5.88888888888888888888; //double represents the integer with decimal data type
	public static float height = 5.88888888f; 
	public static float shoesize = 8.888888888f;
	public static short sales = 32000; //-3267 to + 3267
	public static byte memory = 127; // byte is the shortest memory point, int is short, primitive data type
	public static long distance = 3000000000l; //
	public static boolean BigFoot = true;
	public static String letters = "abcdefg";
	public static char letter = '6'; // letter will represent only one character at a time, ex: 2a, $, 2
 
	public static void main(String[] args) {
		 byte memory = 127; //local variable 
		// TODO Auto-generated method stub
		System.out.println(height + shoesize);
		System.out.println(height + sales);
		System.out.println(height +  memory);
		System.out.println(BigFoot);
		datatype practice = new datatype();
		practice.Aidah();
		

		private void Aidah() {
			datatype honda1 = new datatype();
			System.out.println(honda1.age);
		}
	}

}
// we can either put public static infront of variables and can print or we have to create a object inside the method to print it or to access it. 