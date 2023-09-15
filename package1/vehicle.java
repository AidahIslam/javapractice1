package package1;

public class vehicle {
	public static int wheel = 4;
	String color = "red";
	String shape = "rectangle";
	public int	windows = 4;
	public int door = 4; 
	public int speed = 120;
	
	public void travel () {
		vehicle honda1 = new vehicle();
		System.out.println(honda1.speed);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // public int wheel = 4;
		vehicle honda = new vehicle ();
		System.out.println(wheel);
		System.out.println(honda.windows + honda.door);
		System.out.println(honda.shape);
		
		System.out.println(honda.speed);
		honda.travel();
	}
}
