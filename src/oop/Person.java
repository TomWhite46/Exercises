package oop;

import java.util.ArrayList;

public class Person {

	public static ArrayList<Person> allPeople = new ArrayList<>();

	public String name;
	public int age;
	public String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		allPeople.add(this);
	}

	public void displayStats() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job: ");
		System.out.println(this.jobTitle);
		System.out.println();
	}

}
