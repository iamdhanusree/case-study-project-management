//package com.java.transport.dao;
//
//import com.java.transport.model.payment;
//import java.util.List;
//
//public interface paymentdao {
//    // Method to create a new payment
//    boolean addPayment(payment payment);
//    
//    // Method to update an existing payment
//    boolean updatePayment(int paymentId);
//    
//    // Method to delete a payment
//    boolean deletePayment(int paymentId);
//    
//    // Method to fetch a payment by its ID
//    payment getPaymentById(int paymentId);
//    
//    // Method to get all payments
//    List<payment> getAllPayments();
//}
package com.java.transport.dao;

import com.java.transport.model.payment;
import java.util.List;

public interface paymentdao {
    
    // Method to create a new payment
    boolean addPayment(payment payment);
    
    // Method to update an existing payment
    boolean updatePayment(payment payment);  // Accepting a payment object
    
    // Method to delete a payment
    boolean deletePayment(int paymentId);
    
    // Method to fetch a payment by its ID
    payment getPaymentById(int paymentId);
    
    // Method to get all payments
    List<payment> getAllPayments();
    
    // Add or Clear payment method (as per your original query)
    String addOrClearPayment(payment payment);
}
