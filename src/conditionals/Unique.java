package conditionals;

public class Unique {

	public static int uniqueSum(int x, int y, int z) {

		int sum = 0;

		if (x != y && x != z) {
			sum = sum + x;
		}

		if (y != x && y != z) {
			sum = sum + y;
		}

		if (z != x && z != y) {
			sum = sum + z;
		}

		return sum;

	}

}
