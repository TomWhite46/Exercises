package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFun {

	public static void create() {
		ArrayList<String> newList = new ArrayList<>();
		newList.add("life");
		newList.add("finds");
		newList.add("a");
		newList.add("way");
		System.out.println(newList);

		for (int i = 0; i < newList.size(); i++) {
			System.out.println("Normal loop: " + newList.get(i));
		}

		for (String item : newList) {
			System.out.println("For-each loop: " + item);
		}

//		get
		System.out.println(newList.get(2));

//		set
		newList.set(1, "found");
		System.out.println(newList);

//		remove
		newList.remove("a"); // remove by value
		System.out.println(newList);
		newList.remove(1); // remove by index
		System.out.println(newList);

		newList.set(1, "finds");
		newList.add("a");
		newList.add("way");
		System.out.println(newList);

//		sort
		Collections.sort(newList);
		System.out.println(newList);

//		reverse
		Collections.reverse(newList);
		System.out.println(newList);

//		swap
		Collections.swap(newList, 0, 1);
		Collections.swap(newList, 1, 2);
		Collections.swap(newList, 2, 3);
		System.out.println(newList);

//		copy
		ArrayList<String> anotherList = new ArrayList<>();
		anotherList.add("one");
		anotherList.add("two");
		anotherList.add("three");
		anotherList.add("four");

		Collections.copy(anotherList, newList);
		System.out.println("Second list: " + anotherList);

	}

}
