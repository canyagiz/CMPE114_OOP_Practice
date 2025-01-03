package Question2;

public class Main {

	public static void main(String[] args) {
		Person[] persons = {
				new Employee("Bob",25,180.0,50000.0),
				new Student("Alice",19,160.0,3.9),
				new Employee("Frank", 28, 185.0, 55000.0),
				new Student("Carol", 21, 170.0,3.5),
				new Employee("Dave", 30, 175.0, 60000.0),
				new Student("Eve",22,165.0,3.7)	
		};
		SelectionSort.listElements(persons);
		System.out.println();
		
		// Sort persons by age
		SelectionSort.sort(persons, "age");
		SelectionSort.listElements(persons);
		System.out.println();
		
		// Sort persons by height
		SelectionSort.sort(persons, "height");
		SelectionSort.listElements(persons);
		
		System.out.println();
		// Sort persons by name
		SelectionSort.sort(persons, "name");
		SelectionSort.listElements(persons);

	}

}
