package chatgptPractice.Wildcard.WildPractice1.WildcardPractice2.Problem3;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample3 {
    // Method to process payment
    public static void processPayments(List<? super DebitCard> payments){
        for (Object payment: payments){
            ((Payment)payment).pay();// Cast to Payment to call the method
        }
    }

    public static void main(String[] args) {
        List<Payment> paymentMethods = new ArrayList<>();
        paymentMethods.add(new CreditCard());
        paymentMethods.add(new DebitCard());
        paymentMethods.add(new UPI());

        System.out.println("Processing Payments:");
        processPayments(paymentMethods);
    }
}
