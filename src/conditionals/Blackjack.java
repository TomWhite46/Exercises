package conditionals;

public class Blackjack {

	public static int play(int i, int j) {

		if (i > 21 && j > 21) {
			return 0;
		} else if (i > 21) {
			return j;
		} else if (j > 21) {
			return i;
		} else if (i >= j) {
			return i;
		} else {
			return j;
		}
	}

}
