package results.copy;

public class Results {

	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public double percentage;
	public String name;

	public Results(String first_name, int physMark, int chemMark, int bioMark) {
		this.name = first_name;
		this.physics = physMark;
		this.chemistry = chemMark;
		this.biology = bioMark;
		this.total = physics + chemistry + biology;
		this.percentage = (total * 100) / 450;
	}

	public void showAll() {
		showResults();
		showPercentage();
	}

	public void showResults() {
		System.out.println(name + "'s results are as follows:");
		System.out.println("Physics: " + physics + "/150");
		System.out.println("Chemistry: " + chemistry + "/150");
		System.out.println("Biology: " + biology + "/150");
		System.out.println("Total: " + total + "/450");
	}

	public void showPercentage() {
		System.out.println(name + "'s overall percentage: " + percentage + "%");
		System.out.println();
	}

}
