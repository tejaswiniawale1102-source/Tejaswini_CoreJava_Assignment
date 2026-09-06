package p1;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee() {
		System.out.println("In Employee Constructor");
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}
		Employee(int id, String name, double salary) {
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
	double calSalary() {
		return this.salary;
	}


	void Display() {
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
	}
}
//Employee class ends here
class Admin extends Employee {

    double allowance;

    Admin() {
        super();
        this.allowance = 0;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    double getAllowance() {
        return this.allowance;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    double calSalary() {
        return this.salary + this.allowance;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("Admin Allowance : " + this.allowance);
    }

    @Override
    public String toString() {
        return "Admin [allowance=" + allowance + "]";
    }
}
//Admin class ends here
class SalesManager extends Employee {

    double commission;

    SalesManager() {
        super();
        this.commission = 0;
    }

    SalesManager(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    double getCommission() {
        return this.commission;
    }

    void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    double calSalary() {
        return this.salary + this.commission;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("Sales Commission : " + this.commission);
    }

    @Override
    public String toString() {
        return "SalesManager [commission=" + commission + "]";
    }
}
//SalesManager class ends here
class HR extends Employee {

    double bonus;

    HR() {
        super();
        this.bonus = 0;
    }

    HR(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    double getBonus() {
        return this.bonus;
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    double calSalary() {
        return this.salary + this.bonus;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("HR Bonus : " + this.bonus);
    }

    @Override
    public String toString() {
        return "HR [bonus=" + bonus + "]";
    }
}
public class TestEmployee {

	public static void main(String[] args) {
		 Employee e;

	        e = new Admin(101, "Raj", 30000, 5000);
	        System.out.println("Admin Salary : " + e.calSalary());

	        e = new SalesManager(102, "Amit", 40000, 8000);
	        System.out.println("SalesManager Salary : " + e.calSalary());

	        e = new HR(103, "Sneha", 35000, 6000);
	        System.out.println("HR Salary : " + e.calSalary());
	}

}
