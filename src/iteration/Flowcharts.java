package iteration;

public class Flowcharts {

	public static void flowChart1() {

		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}

	}

	public static void flowChart2(int a) {

		do {

			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}

			a++;

		} while (a <= 200);

	}

	public static void flowChart3() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}
	}

	public static void flowChart5() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}

}
