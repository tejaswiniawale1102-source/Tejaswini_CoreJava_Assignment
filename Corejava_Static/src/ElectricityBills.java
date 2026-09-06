
class ElectricityBills {
	
	String customerName;
	int rateConsumed;
	static double ratePerUnit;
	
		
	public ElectricityBills(String customerName, int rateConsumed) 
		{
		this.customerName = customerName;
		this.rateConsumed = rateConsumed;
	    }
	
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	int getRateConsumed() {
		return rateConsumed;
	}

	void setRateConsumed(int rateConsumed) {
		this.rateConsumed = rateConsumed;
	}

	static double getRatePerUnit() {
		return ratePerUnit;
	}

	static void setRatePerUnit(double ratePerUnit) {
		ElectricityBills.ratePerUnit = ratePerUnit;
	}

	double calculateBill()
	{
		return rateConsumed * ratePerUnit;
	}

	public static void main(String[] args) {
		setRatePerUnit(8.5);
		
		ElectricityBills e1 = new ElectricityBills("Tejaswini",100);
		
		ElectricityBills e2 = new ElectricityBills("Sumedh",200);

		System.out.println("Bill of "+e1.getCustomerName() + "=" + e1.calculateBill());

		System.out.println("Bill of "+e2.getCustomerName() + "=" + e2.calculateBill());

		setRatePerUnit(10.0);
		
		System.out.println("After Rate Update:");

		System.out.println("Bill of " + e1.getCustomerName() + "=" + e1.calculateBill());

		System.out.println("Bill of " + e2.getCustomerName() + "=" + e2.calculateBill());
	}
	

	
}
