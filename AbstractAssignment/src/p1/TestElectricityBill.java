package p1;
abstract class ElectricityBill {

    int consumerId;
    String consumerName;
    double units;
    double billAmount;

    ElectricityBill() {
        super();
        this.consumerId = 0;
        this.consumerName = "Not Given";
        this.units = 0;
        this.billAmount = 0;
    }

    ElectricityBill(int consumerId, String consumerName,
                    double units, double billAmount) {
        super();
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.units = units;
        this.billAmount = billAmount;
    }

    int getConsumerId() {
        return consumerId;
    }

    void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    String getConsumerName() {
        return consumerName;
    }

    void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    double getUnits() {
        return units;
    }

    void setUnits(double units) {
        this.units = units;
    }

    double getBillAmount() {
        return billAmount;
    }

    void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    abstract void calculateBill();

    void printBill() {
        System.out.println("Consumer ID : " + this.consumerId);
        System.out.println("Consumer Name : " + this.consumerName);
        System.out.println("Units : " + this.units);
        System.out.println("Bill Amount : " + this.billAmount);
    }

    @Override
    public String toString() {
        return "ElectricityBill consumerId=" + consumerId
                + ", consumerName=" + consumerName
                + ", units=" + units
                + ", billAmount=" + billAmount;
    }
}
class ResidentialBill extends ElectricityBill {

    double ratePerUnit;

    ResidentialBill() {
        super();
        this.ratePerUnit = 0;
    }

    ResidentialBill(int consumerId, String consumerName,
                    double units, double billAmount,
                    double ratePerUnit) {
        super(consumerId, consumerName, units, billAmount);
        this.ratePerUnit = ratePerUnit;
    }

    double getRatePerUnit() {
        return ratePerUnit;
    }

    void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    void calculateBill() {
        this.billAmount = this.units * this.ratePerUnit;
    }

    @Override
    public String toString() {
        return "ResidentialBill ratePerUnit=" + ratePerUnit;
    }
}
class CommercialBill extends ElectricityBill {

    double ratePerUnit;

    CommercialBill() {
        super();
        this.ratePerUnit = 0;
    }

    CommercialBill(int consumerId, String consumerName,
                   double units, double billAmount,
                   double ratePerUnit) {
        super(consumerId, consumerName, units, billAmount);
        this.ratePerUnit = ratePerUnit;
    }

    double getRatePerUnit() {
        return ratePerUnit;
    }

    void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    void calculateBill() {
        this.billAmount = this.units * this.ratePerUnit;
    }

    @Override
    public String toString() {
        return "CommercialBill ratePerUnit=" + ratePerUnit;
    }
}

public class TestElectricityBill {

	public static void main(String[] args) {
		ElectricityBill e;

	    e = new ResidentialBill(101, "Raj", 100, 0, 5);

	    e.calculateBill();
	    e.printBill();

	    System.out.println();

	    e = new CommercialBill(102, "Amit", 200, 0, 8);

	    e.calculateBill();
	    e.printBill();
	}

}
