package results;

public class Results {

	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;
	public static String name;

	public static void inputResults(String first_name, int physMark, int chemMark, int bioMark) {
		name = first_name;
		physics = physMark;
		chemistry = chemMark;
		biology = bioMark;
		total = physics + chemistry + biology;
		percentage = (total * 100) / 450;
	}

	public static void showAll() {
		showResults();
		showPercentage();
	}

	public static void showResults() {
		System.out.println(name + "'s results are as follows:");
		System.out.println("Physics: " + physics + "/150");
		System.out.println("Chemistry: " + chemistry + "/150");
		System.out.println("Biology: " + biology + "/150");
		System.out.println("Total: " + total + "/450");
	}

	public static void showPercentage() {
		System.out.println(name + "'s overall percentage: " + percentage + "%");
	}

}
