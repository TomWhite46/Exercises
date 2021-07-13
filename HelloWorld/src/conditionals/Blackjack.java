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

	public static int playVar(int i, int j) {
		if (i <= 21 && (i >= j || j > 21)) {
			return i;
		} else if (j <= 21) {
			return j;
		} else {
			return 0;
		}
	}
}
