package results2;

public class App {

	public static void main(String[] args) {

		Results student1 = new Results("Jordan H", 125, 130, 140);
		Results student2 = new Results("Jordan B", 145, 125, 135);
		student1.showAll();
		student2.showAll();

		if (student1.total > student2.total) {
			System.out.println("With a total of " + student1.percentage + "%, " + student1.name + " is better than "
					+ student2.name + ", who got " + student2.percentage + "%.");
		} else {
			System.out.println("With a total of " + student2.percentage + "%, " + student2.name + " is better than "
					+ student1.name + ", who got " + student1.percentage + "%.");
		}

	}

}
