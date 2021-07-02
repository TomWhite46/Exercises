package oop;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<>();
//		create new and simultaneously assign to ArrayList
		people.add(new Person("Sam Neill", 35, "Palaeontologist"));
		people.add(new Person("Jeff Goldblum", 30, "Chaotician"));
		people.add(new Person("Laura Dern", 33, "Palaeobotanist"));
		people.add(new Person("Samuel L. Jackson", 40, "System Admin"));
		people.add(new Person("Richard Attenborough", 70, "Old guy"));
		people.add(new Person("Lawyer whose name I forget", 46, "Rapacious Lawyer"));

//		loop through all; print out all details using displayStats method
		System.out.println("There are " + people.size() + " people: \n");
		for (Person human : people) {
			human.displayStats();
		}

		searchName("ld");

		// search for person by name
		String searchName = "Jeff Goldblum";

		for (Person person : people) {
			if (person.name == searchName) {
				System.out.println("Life finds a way");
				person.displayStats();
				break;
			}
		}

	}

	public static void searchName(String name) {
		for (Person person : Person.allPeople) {

			if (person.name.contains(name)) {
				System.out.println("Life finds a way");
				person.displayStats();
			}
		}
	}

}
