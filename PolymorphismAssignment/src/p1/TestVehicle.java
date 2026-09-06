package p1;

class Vehicle {

    String brand;
    String model;
    double price;

    Vehicle() {
        System.out.println("In Vehicle Constructor");
        this.brand = "Not Given";
        this.model = "Not Given";
        this.price = 0;
    }

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return this.model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void brake() {
        System.out.println("Vehicle brake");
    }

    void Display() {
        System.out.println("Vehicle Brand : " + this.brand);
        System.out.println("Vehicle Model : " + this.model);
        System.out.println("Vehicle Price : " + this.price);
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model
                + ", price=" + price + "]";
    }
}
// Vehicle Class Ends Here
class Bike extends Vehicle {

    Bike() {
        super();
    }

    Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    void brake() {
        System.out.println("Bike brake");
    }

    @Override
    public String toString() {
        return "Bike [brand=" + brand + ", model=" + model
                + ", price=" + price + "]";
    }
}
// Bike Class Ends Here
class Car extends Vehicle {

    Car() {
        super();
    }

    Car(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    void brake() {
        System.out.println("Car brake");
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model
                + ", price=" + price + "]";
    }
}
// Car Class Ends Here
class Bus extends Vehicle {

    Bus() {
        super();
    }

    Bus(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    void brake() {
        System.out.println("Bus brake");
    }

    @Override
    public String toString() {
        return "Bus [brand=" + brand + ", model=" + model
                + ", price=" + price + "]";
    }
}
// Bus Class Ends Here
public class TestVehicle {

    public static void main(String[] args) {

        Vehicle v;

        v = new Bike("Honda", "Shine", 90000);
        System.out.println(v);
        v.brake();

        System.out.println();

        v = new Car("Toyota", "Innova", 2500000);
        System.out.println(v);
        v.brake();

        System.out.println();

        v = new Bus("Volvo", "B9R", 8000000);
        System.out.println(v);
        v.brake();
    }
}