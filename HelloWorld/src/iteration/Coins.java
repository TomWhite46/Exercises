package iteration;

public class Coins {

	public static void change(double cost, double paid) {

		if (cost == paid) {
			System.out.println("You have paid the exact amount!");
			return;
		} else if (cost > paid) {
			System.out.println("You owe me £" + (cost - paid) + "!");
			return;
		}

		int remaining = ((int) (paid * 100)) - ((int) (cost * 100));

		// much better with arrays!
		int[] denomTypes = { 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int denomType : denomTypes) {
			remaining = getRemainder(remaining, denomType);
		}

	}

	public static int getRemainder(int remaining, int denom) {
		// takes in remaining change needed, value of note/coin
		// returns updated remainder value, and prints no of specified denomination

		int numDenom = 0;
		while (remaining >= denom) {
			numDenom++;
			remaining -= denom;
		}

		String denomVal;
		if (denom > 99) {
			denomVal = "£" + denom / 100;
		} else {
			denomVal = denom + "p";
		}

		String name;
		if (denom > 100) {
			name = "notes";
		} else {
			name = "coins";
		}

		System.out.print("Number of ");
		System.out.print(denomVal);
		System.out.print(" ");
		System.out.print(name);
		System.out.print(": ");
		System.out.println(numDenom);

		return remaining;

	}

}
