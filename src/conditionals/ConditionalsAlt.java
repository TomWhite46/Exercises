package conditionals;

public class ConditionalsAlt {

	public static void fizzBuzz(int i) {

		String str = "";

		if (i % 3 == 0 || i % 5 == 0) {

			if (i % 3 == 0) {
				str = "Fizz";
			}

			if (i % 5 == 0) {
				str = str + "Buzz";
			}

		} else
			str = "" + i;

		System.out.println(str);

	}

}
