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
class Admin extends Employee{
		double allowance;
	
	Admin(){
		super();//Calling Employee Class
		this.allowance = 3000;
	}

	Admin(int id,String Name,double salary,double allowance) {
		super(id,Name,salary);//Calling SuperClass(Employee) Constructor
		this.allowance = allowance;
	}

	double getAllowance() {
		return this.allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	double calSalary() {
		System.out.println("calSal of Admin");
		return this.salary+this.allowance;
	}
	
	void Display() {
		super.Display();
		System.out.println("Allowance : "+this.allowance);
		System.out.println();
	}
}
	
class SalesManager extends Employee{
	double incentive;
	int target;
	
	SalesManager() {
         System.out.println("In SM Constructor");
		this.incentive = 7000;
		this.target = 50000;
	}
	SalesManager(int id, String name, double salary,double incentive,int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	double getIncentive() {
		return this.incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return this.target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	double calSalary() {
		System.out.println("calSal of SM");
		return this.salary+this.incentive;
	}	
	void Display() {
		super.Display();
		System.out.println("Incentive : "+this.incentive);
		System.out.println("Target : "+this.target);
		System.out.println();
	}
}

class HR extends Employee{
	double commission;

	HR() {
		super();//Calling Employee Class
		this.commission = 5000;
	}

	HR(int id, String name, double salary,double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return this.commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	double calSalary() {
		System.out.println("calSal of HR");
		return this.salary+this.commission;
	}
	
	void Display() {
		super.Display();
		System.out.println("Commission : "+this.commission);
		System.out.println();
	}
}
 public class EmployeeTest {
   
	 	public static void main(String[] args) {
			HR h1=new HR(101,"Ahijeet",25000,2000);
			SalesManager s1=new SalesManager(102,"Devendra",30000,1000,4);
			printDetails(s1);
		} 
	 	public static void printDetails(Employee e1) {
	 		System.out.println(e1.getId());
	 		System.out.println(e1.name);
	 		System.out.println(e1.getSalary());
	 		if(e1 instanceof HR) {
	 			HR h1=(HR)e1;
	 			System.out.println(h1.getCommission());
	 	}
	 		if(e1 instanceof SalesManager) {
	 			SalesManager s1=(SalesManager)e1;
	 			System.out.println(s1.getIncentive());
	 		}
	 		if(e1 instanceof Admin) {
	 			Admin a1=(Admin)e1;
	 			System.out.println(a1.getAllowance());
	 		}
	 //public static void main1(String[] args) {
		// Employee e1;

      // e1 = new Employee(101, "Sumedh", 6000);
      // e1.Display();
//
  //     e1 = new Admin(102, "Rahul", 25000, 5000);
    //   e1.Display();
//      e1 = new SalesManager(103, "Amit", 30000, 4000, 50);
  //     e1.Display();

    //  e1 = new HR(104, "Priya", 28000, 3500);
     // e1.Display();
    }
	  
		
	}
