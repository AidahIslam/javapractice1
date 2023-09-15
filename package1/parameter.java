package package1;

public class parameter {
	void sum (int a, int b) {
		System.out.println(a+b);
	}
	void sub (int a, int b) {
		System.out.println(a-b);
	}
	void multi (int a, int b) {
		System.out.println(a*b);
	}
	void divide (int a, int b) {
		System.out.println(a/b);
	}
	void EvenOrOdd (int num) {
		if (num % 2 ==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}
	void message (String msg, String msg2) {
		System.out.println(msg+" "+msg2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter obj = new parameter();
		obj.sum(5, 10);
		obj.sub(10, 5);
		obj.multi(5, 10);
		obj.divide(10, 5);
		obj.EvenOrOdd(15);
		obj.message("hello", "aidah");
	}

}
