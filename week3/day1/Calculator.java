package week3.day1;

public class Calculator {

	private Object subTwonumbers;
	private static Object subTwonumbers2;

	public void addTwonumbers(int x, int y) {
		int sum = x + y;
		System.out.println("Addition of x+y is= " + sum);

	}

	public void addTwonumbers(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("Addition of three numbers x+y+z is =" + sum);

	}

	public void addTwonumbers1(int z, int r) {
		int sub = z - r;
		System.out.println("The subtraction of two numbers is =" + sub);

	}

	public static void main(String[] args) {

		Calculator calculation = new Calculator();
		calculation.addTwonumbers(100, 500);
		calculation.addTwonumbers(100, 500, 1000);
		calculation.addTwonumbers1(1500, 150);
	}

}
