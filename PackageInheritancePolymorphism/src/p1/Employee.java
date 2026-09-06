package p1;

public abstract class Employee {
	protected int id;
	protected String name;
	protected double salary;
	
	Employee() {
		System.out.println("In Employee Constructor");
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}
		protected Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return this.id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return this.salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	public abstract double calSal(); 
	


	void Display() {
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
	}
}



