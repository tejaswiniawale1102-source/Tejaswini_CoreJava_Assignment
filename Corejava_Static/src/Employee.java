
class Employee {
	
	String employeeName;
	double basicSalary;
	static double bonusRate;
	
	Employee(String employeeName, double employeeSalary) {
		this.employeeName = employeeName;
		this.basicSalary = employeeSalary;
	}

	String getEmployeeName() {
		return employeeName;
	}

	void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	double getEmployeeSalary() {
		return basicSalary;
	}

	void setEmployeeSalary(double employeeSalary) {
		this.basicSalary = employeeSalary;
	}

	static double getBonusRate() {
		return bonusRate;
	}

	static void setBonusRate(double bonusRate) {
		Employee.bonusRate = bonusRate;
	}

    double calculateSalary()
    {
		return basicSalary + (basicSalary * bonusRate / 100);
    }

	public static void main(String[] args) {
        setBonusRate(8.5);
        
        Employee e1 = new Employee("Neha",35000);
        
        Employee e2 = new Employee("Sneha",40000);

        System.out.println("Salary of "+e1.getEmployeeName() + "=" + e1.calculateSalary());

		System.out.println("Salary of "+e2.getEmployeeName() + "=" + e2.calculateSalary());

        setBonusRate(10.0);
        
        System.out.println("After Bonus Rate Update");
        
        System.out.println("Salary of "+e1.getEmployeeName() + "=" + e1.calculateSalary());

		System.out.println("Salary of "+e2.getEmployeeName() + "=" + e2.calculateSalary());
        
        
        
	}

}
