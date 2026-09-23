class Payment {
    void makePayment(double amount) {
        System.out.println("Payment Amount : Rs. " + amount);
    }
    void makePayment(double amount, String receiver) {
        System.out.println("Payment Amount : Rs. " + amount);
        System.out.println("Receiver       : " + receiver);
    }
    void makePayment(double amount, String receiver, String mode) {
        System.out.println("Payment Amount : Rs. " + amount);
        System.out.println("Receiver       : " + receiver);
        System.out.println("Payment Mode   : " + mode);
    }
}
class UPIPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("UPI Payment");
        System.out.println("Payment Amount : Rs. " + amount);
        System.out.println("Payment Status : Successful");
    }
}
public class Experiment5 {
    public static void main(String[] args) {   
        UPIPayment upi = new UPIPayment();
        System.out.println("----- Compile-time Polymorphism -----");      
        upi.makePayment(1000.00);
        System.out.println();
        upi.makePayment(1500.00, "Rahul");
        System.out.println();
        upi.makePayment(2000.00, "Priya", "UPI");
        System.out.println("\n----- Runtime Polymorphism -----");   
        upi.makePayment(2500.00);
    }
}
