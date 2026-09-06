class Vehicle{
	int vehicleNumber;
	String model;
	String companyName;
	double price;
	int noOfWheels;
	
	Vehicle()
    {
        this.vehicleNumber = 0;
        this.model = "Not Given";
        this.companyName = "Not Given";
        this.noOfWheels = 0;
        this.price = 0;
    }
	
	Vehicle(int vehicleNumber, String model, String companyName, double price, int noOfWeeks) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.price = price;
		this.noOfWheels = noOfWeeks;
	}

	int getVehicleNumber() {
		return vehicleNumber;
	}

	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getNoOfWeeks() {
		return noOfWheels;
	}

	void setNoOfWeeks(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	String VehicleType()
	{
		return "vehicle";
	}
	
	void display() {
		System.out.println("Vehicle Number :"+this.vehicleNumber);
		System.out.println("Model :"+this.model);
		System.out.println("Company Name :"+this.companyName);
		System.out.println("Vehicle Price :"+this.price);
		System.out.println("No of wheels");
		}
}

class Bike extends Vehicle {
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	
	Bike() {
		super();
		this.noOfStands = 1;
		this.noOfHelmets = 1;
		this.bikeCategory = "Sports";
	}
		Bike(int vehicleNumber,String model,String companyName,int price,int noOfWheels,int noOfStands, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber, model, companyName, price, noOfWheels);//calling superclass(Vehicle) constructor
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
		int getNoOfStands() {
			return noOfStands;
		}
		void setNoOfStands(int noOfStands) {
			this.noOfStands = noOfStands;
		}
		int getNoOfHelmets() {
			return noOfHelmets;
		}
		void setNoOfHelmets(int noOfHelmets) {
			this.noOfHelmets = noOfHelmets;
		}
		String getBikeCategory() {
			return bikeCategory;
		}
		void setBikeCategory(String bikeCategory) {
			this.bikeCategory = bikeCategory;
		}
		String vehicleType()
		{
		    return "Bike";
		}

		void display()
		{
		    super.display();

		    System.out.println("No of Stands : " + this.noOfStands);
		    System.out.println("No of Helmets : " + this.noOfHelmets);
		    System.out.println("Bike Category : " + this.bikeCategory);
		    System.out.println();
		}
	}
//class Bike Ends here
class Car extends Vehicle
{
    String hasPowerSteering;
    String driveMode;
    String parkingAssistSensors;

    Car()
    {
        super();
        this.hasPowerSteering = "Available";
        this.driveMode = "Automatic";
        this.parkingAssistSensors = "Available";
    }

    Car(int vehicleNumber, String model, String companyName,
        double price, int noOfWheels,
        String hasPowerSteering, String driveMode,
        String parkingAssistSensors)
    {
        super(vehicleNumber, model, companyName, price, noOfWheels);

        this.hasPowerSteering = hasPowerSteering;
        this.driveMode = driveMode;
        this.parkingAssistSensors = parkingAssistSensors;
    }

    String getHasPowerSteering()
    {
        return hasPowerSteering;
    }

    void setHasPowerSteering(String hasPowerSteering)
    {
        this.hasPowerSteering = hasPowerSteering;
    }

    String getDriveMode()
    {
        return driveMode;
    }

    void setDriveMode(String driveMode)
    {
        this.driveMode = driveMode;
    }

    String getParkingAssistSensors()
    {
        return parkingAssistSensors;
    }

    void setParkingAssistSensors(String parkingAssistSensors)
    {
        this.parkingAssistSensors = parkingAssistSensors;
    }

    String vehicleType()
    {
        return "Car";
    }

    void display()
    {
        super.display();

        System.out.println("Power Steering : " + this.hasPowerSteering);
        System.out.println("Drive Mode : " + this.driveMode);
        System.out.println("Parking Assist Sensors : " + this.parkingAssistSensors);
    }
}	
//class car ends here
class Bus extends Vehicle
{
    int passengerCapacity;
    int standingCapacity;

    Bus()
    {
        super();
        this.passengerCapacity = 0;
        this.standingCapacity = 0;
    }

    Bus(int vehicleNumber, String model, String companyName,
        double price, int noOfWheels,
        int passengerCapacity, int standingCapacity)
    {
        super(vehicleNumber, model, companyName, price, noOfWheels);

        this.passengerCapacity = passengerCapacity;
        this.standingCapacity = standingCapacity;
    }

    int getPassengerCapacity()
    {
        return passengerCapacity;
    }

    void setPassengerCapacity(int passengerCapacity)
    {
        this.passengerCapacity = passengerCapacity;
    }

    int getStandingCapacity()
    {
        return standingCapacity;
    }

    void setStandingCapacity(int standingCapacity)
    {
        this.standingCapacity = standingCapacity;
    }

    String vehicleType()
    {
        return "Bus";
    }

    void display()
    {
        super.display();

        System.out.println("Passenger Capacity : " + this.passengerCapacity);
        System.out.println("Standing Capacity : " + this.standingCapacity);
    }
}
public class TestVehicle
{
    public static void main(String[] args)
    {
        Vehicle[] arr;
        arr = new Vehicle[3];

        arr[0] = new Bike(101, "Splendor", "Hero", 85000, 2,
                          1, 2, "Sports");

        arr[1] = new Car(102, "Creta", "Hyundai", 1200000, 4,
                         "Available", "Automatic", "Available");

        arr[2] = new Bus(103, "9400", "Volvo", 5000000, 6,
                         50, 20);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Vehicle Type : " + arr[i].VehicleType());
            arr[i].display();
            System.out.println();
        }
    }
}
