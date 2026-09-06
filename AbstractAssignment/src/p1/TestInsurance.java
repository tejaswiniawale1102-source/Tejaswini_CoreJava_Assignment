package p1;

abstract class Insurance {

    int policyId;
    String policyHolderName;
    double sumAssured;
    double premium;

    Insurance() {
        super();
        this.policyId = 0;
        this.policyHolderName = "Not Given";
        this.sumAssured = 0;
        this.premium = 0;
    }

    Insurance(int policyId, String policyHolderName,
              double sumAssured, double premium) {
        super();
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.sumAssured = sumAssured;
        this.premium = premium;
    }

    int getPolicyId() {
        return policyId;
    }

    void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    String getPolicyHolderName() {
        return policyHolderName;
    }

    void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    double getSumAssured() {
        return sumAssured;
    }

    void setSumAssured(double sumAssured) {
        this.sumAssured = sumAssured;
    }

    double getPremium() {
        return premium;
    }

    void setPremium(double premium) {
        this.premium = premium;
    }

    abstract void calculatePremium();

    void printPolicy() {
        System.out.println("Policy ID : " + this.policyId);
        System.out.println("Policy Holder Name : " + this.policyHolderName);
        System.out.println("Sum Assured : " + this.sumAssured);
        System.out.println("Premium : " + this.premium);
    }

    @Override
    public String toString() {
        return "Insurance policyId=" + policyId
                + ", policyHolderName=" + policyHolderName
                + ", sumAssured=" + sumAssured
                + ", premium=" + premium;
    }
}
class LifeInsurance extends Insurance {

    double premiumRate;

    LifeInsurance() {
        super();
        this.premiumRate = 0;
    }

    LifeInsurance(int policyId, String policyHolderName,
                  double sumAssured, double premium,
                  double premiumRate) {
        super(policyId, policyHolderName, sumAssured, premium);
        this.premiumRate = premiumRate;
    }

    double getPremiumRate() {
        return premiumRate;
    }

    void setPremiumRate(double premiumRate) {
        this.premiumRate = premiumRate;
    }

    @Override
    void calculatePremium() {
        this.premium = this.sumAssured * this.premiumRate / 100;
    }

    @Override
    public String toString() {
        return "LifeInsurance remiumRate=" + premiumRate;
    }
}
class HealthInsurance extends Insurance {

    double premiumRate;

    HealthInsurance() {
        super();
        this.premiumRate = 0;
    }

    HealthInsurance(int policyId, String policyHolderName,
                    double sumAssured, double premium,
                    double premiumRate) {
        super(policyId, policyHolderName, sumAssured, premium);
        this.premiumRate = premiumRate;
    }

    double getPremiumRate() {
        return premiumRate;
    }

    void setPremiumRate(double premiumRate) {
        this.premiumRate = premiumRate;
    }

    @Override
    void calculatePremium() {
        this.premium = this.sumAssured * this.premiumRate / 100;
    }

    @Override
    public String toString() {
        return "HealthInsurance premiumRate=" + premiumRate;
    }
}

public class TestInsurance {
    public static void main(String[] args) {
    	 Insurance i;

    	    i = new LifeInsurance(101, "Raj", 500000, 0, 2);

    	    i.calculatePremium();
    	    i.printPolicy();

    	    System.out.println();

    	    i = new HealthInsurance(102, "Amit", 300000, 0, 3);

    	    i.calculatePremium();
    	    i.printPolicy();

    }
}



