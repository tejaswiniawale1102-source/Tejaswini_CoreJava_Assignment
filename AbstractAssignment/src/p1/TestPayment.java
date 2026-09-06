package p1;
abstract class Payment{
	int paymentId;
	double amount;
	String payerName;
	String status;
	
	
	public Payment() {
		super();
		this.paymentId = 0;
		this.amount = 0;
		this.payerName = "Not Given";
		this.status = "PENDING";
		
	}
	public Payment(int paymentId, double amount, String payerName, String status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = status;
	}
	int getPaymentId() {
		return paymentId;
	}
	void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	double getAmount() {
		return amount;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	String getPayerName() {
		return payerName;
	}
	void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
	    return "Payment [paymentId=" + paymentId + ", amount=" + amount
	            + ", payerName=" + payerName + ", status=" + status + "]";
	}

    void printSummary() {
        System.out.println("Payment ID : " + this.paymentId);
        System.out.println("Amount : " + this.amount);
        System.out.println("Payer Name : " + this.payerName);
        System.out.println("Status : " + this.status);
    }

    final void process() {

        if (validate()) {
            deductAmount();
            sendNotification();
            status = "SUCCESS";
        } else {
            status = "FAILED";
            System.out.println("Payment Failed.");
        }
    }
    abstract boolean validate();

    abstract void deductAmount();

    abstract void sendNotification();
}
class CardPayment extends Payment {

    String cardNumber;
    String cvv;

    CardPayment() {
        super();
        this.cardNumber = "Not Given";
        this.cvv = "Not Given";
    }

    CardPayment(int paymentId, double amount, String payerName,
                String status, String cardNumber, String cvv) {

        super(paymentId, amount, payerName, status);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    String getCardNumber() {
        return cardNumber;
    }

    void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    String getCvv() {
        return cvv;
    }

    void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    boolean validate() {

        if (cardNumber.length() == 16
                && cvv.length() == 3
                && amount > 0) {

            System.out.println("Card Validation Successful.");
            return true;

        } else {

            System.out.println("Card Validation Failed.");
            return false;
        }
    }

    @Override
    void deductAmount() {
        System.out.println("Amount Deducted : " + amount);
    }

    @Override
    void sendNotification() {
        System.out.println("Card Payment Notification Sent.");
    }

    @Override
    public String toString() {
        return "CardPayment [cardNumber=" + cardNumber
                + ", cvv=" + cvv + "]";
    }
}
class UPIPayment extends Payment {

    String upiId;
    String pin;

    UPIPayment() {
        super();
        this.upiId = "Not Given";
        this.pin = "Not Given";
    }

    UPIPayment(int paymentId, double amount, String payerName,
               String status, String upiId, String pin) {

        super(paymentId, amount, payerName, status);
        this.upiId = upiId;
        this.pin = pin;
    }

    String getUpiId() {
        return upiId;
    }

    void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    String getPin() {
        return pin;
    }

    void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    boolean validate() {

        if (upiId != null
                && upiId.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+")
                && pin != null
                && pin.matches("\\d{4}")
                && amount > 0) {

            System.out.println("UPI Validation Successful.");
            return true;

        } else {

            System.out.println("UPI Validation Failed.");
            return false;
        }
    }

    @Override
    void deductAmount() {
        System.out.println("Amount Deducted : " + amount);
    }

    @Override
    void sendNotification() {
        System.out.println("UPI Payment Notification Sent.");
    }

    @Override
    public String toString() {
        return "UPIPayment [upiId=" + upiId + ", pin=" + pin + "]";
    }
}
public class TestPayment {

	public static void main(String[] args) {
		 Payment p;

		    p = new CardPayment(101, 5000, "Raj", "PENDING",
		            "1234567890123456", "123");

		    p.process();
		    p.printSummary();

		    System.out.println();

		    p = new UPIPayment(102, 2000, "Amit", "PENDING",
		            "amit@upi", "12");

		    p.process();
		    p.printSummary();

	}

}
