package calc;

public class Calculator {

	public static double add(double x, double y) { // add y to x
		return x + y;
	}

	public static double multiply(double x, double y) { // multiply x by y
		return x * y;
	}

	public static double divide(double x, double y) { // divides x by y
		return x / y;
	}

	public static double subtract(double x, double y) { // subtracts y from x
		return x - y;
	}

	public static String divideWhole(double x, double y) { // divides x by y returning whole number, then gives
															// remainder
		return (int) (x / y) + ", remainder " + x % y;
	}

}
