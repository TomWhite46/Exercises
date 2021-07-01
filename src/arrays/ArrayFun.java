package arrays;

public class ArrayFun {

	public static void arrTest() {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * 4;
		}

		for (int num : nums) {
			System.out.println(num);
		}

	}

	public static void arrTest2() {

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 10;
			System.out.println(numbers[i]);
		}

	}
}
