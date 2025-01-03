package Question2;

public class SelectionSort {
	public static void sort(Person[] persons, String type) {
		switch (type.toLowerCase()) {
		case "name":
			for (int i = 0; i < persons.length; i++) {
				int min = i;
				for (int j = i + 1; j < persons.length; j++) {
					if (persons[j].getName().compareTo(persons[min].getName()) < 0) {
						min = j;
					}

				}
				Person temp = persons[i];
				persons[i] = persons[min];
				persons[min] = temp;
			}
			break;

		case "age":
			for (int i = 0; i < persons.length; i++) {
				int min = i;
				for (int j = i + 1; j < persons.length; j++) {
					if ((persons[j].getAge() < persons[min].getAge())) {
						min = j;
					}

				}
				Person temp = persons[i];
				persons[i] = persons[min];
				persons[min] = temp;
			}
			break;

		case "height":
			for (int i = 0; i < persons.length; i++) {
				int min = i;
				for (int j = i + 1; j < persons.length; j++) {
					if ((persons[j].getHeight() < persons[min].getHeight())) {
						min = j;
					}
				}
				Person temp = persons[i];
				persons[i] = persons[min];
				persons[min] = temp;
			}
			break;
		}

	}
	
	public static void listElements(Person[] persons) {
		for(Person person: persons) {
			System.out.println(person);
		}
	}
}