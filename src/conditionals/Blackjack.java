package conditionals;

public class Blackjack {

	public static int play(int i, int j) {

		if (i >= j && i <= 21) {
			return i;
		} else if (j <= 21) {
			return j;
		} else {
			return 0;
		}

	}

}
