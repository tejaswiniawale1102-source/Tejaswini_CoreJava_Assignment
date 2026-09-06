
class LibraryUser {
	
	String userName;
	int daysLate;
	static double finePerDay;

	LibraryUser(String userName, int dayLate) {
		super();
		this.userName = userName;
		this.daysLate = dayLate;
	}
	String getUserName() {
		return userName;
	}
	
	void setUserName(String userName) {
		this.userName = userName;
	}

	int getDayLate() {
		return daysLate;
	}

	void setDayLate(int dayLate) {
		this.daysLate = dayLate;
	}

	static double getFinePerDay() {
		return finePerDay;
	}

	static void setFinePerDay(double finePerDay) {
		LibraryUser.finePerDay = finePerDay;
	}
     double calculateTotalFine()
    {
    	return daysLate * finePerDay;
    }
	
	public static void main(String[] args) {

		setFinePerDay(9.0);
		
        LibraryUser l1 = new LibraryUser("Aditi",10);
        
        LibraryUser l2 = new LibraryUser("Sneha",15);
        
        System.out.println("Fine  on "+l1.getUserName() + "=" + l1.calculateTotalFine());

		System.out.println("Fine on "+l2.getUserName() + "=" + l2.calculateTotalFine());
		
		setFinePerDay(10.5);
		
		 System.out.println("After Fine Per Day Update");
		 
		 System.out.println("Fine  on "+l1.getUserName() + "=" + l1.calculateTotalFine());

		 System.out.println("Fine on "+l2.getUserName() + "=" + l2.calculateTotalFine());
	        
	     
	}

}
