package Question2;

public class Employee extends Person {
	protected double salary;

	public Employee(String name, int age, double height, double salary) {
		super(name, age, height);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " - " + age + " years, "+ height + " cm, $"
				+ salary;
	}
}
