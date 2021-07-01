package bottles;

public class BottleMeths {

	// takes in start no of bottles, counts down to 1 bottle
	public static void bottles(int startNum) {
		if (startNum < 1) {

			// prevents infinite loop due to input < 1
			System.out.println("Not enough bottles!");

		} else {

			// loops through nos from start no down to 1, printing line for each
			for (int x = startNum; x >= 1; x--) {
				System.out.print(bottleNo(x));
				System.out
						.print(" hanging on the wall; and if one green bottle should accidentally fall, there'll be ");
				System.out.print(bottleNo(x - 1));
				System.out.println(" hanging on the wall.");
			}

		}
	}

	// gets singular or plural of 'bottle' according to whether 1 or not
	public static String bottleNo(int bottleCount) {

		if (bottleCount == 1) {
			return bottleCount + " green bottle";
		} else {
			return bottleCount + " green bottles";
		}
	}
}
