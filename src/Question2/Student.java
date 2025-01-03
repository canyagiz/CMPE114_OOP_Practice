package Question2;

public class Student extends Person {
	protected double gpa;
	
	public Student(String name, int age, double height, double gpa) {
		super(name, age, height);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	 @Override
	    public String toString() {
		 return getName() + " - " + getAge() + " years, "+ getHeight() + " cm, GPA: "
					+ getGpa();
	    }
	

}
