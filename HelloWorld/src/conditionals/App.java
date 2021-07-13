package conditionals;

public class App {

	public static void main(String[] args) {

		System.out.println(Blackjack.playVar(22, 22));

		ConditionalsAlt.fizzBuzz(14);

		System.out.println(Blackjack.play(17, 17));

		System.out.println(Unique.uniqueSum(2, 3, 2));

		System.out.println(Taxes.taxPercent(100000));
		System.out.println(Taxes.totalTax(60000));

		System.out.println(Flowchart.addOrMultiply(5, 5, false));

		System.out.println();

//		Flowchart.flow(200);

	}

}
