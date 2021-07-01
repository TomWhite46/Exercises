package conditionals;

public class Taxes {

	public static int taxPercent(int salary) {

		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}

	}

	public static int totalTax(int salary) {
		return (salary / 100) * taxPercent(salary);
	}

}
