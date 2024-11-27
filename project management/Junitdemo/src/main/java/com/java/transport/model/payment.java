//package com.java.transport.model;
//
//public class payment {
//    private int payMentId;
//    private int bookingId;
//    private double finalAmount;
//
//    // Default Constructor
//    public payment() {}
//
//    // Parameterized Constructor
//    public payment(int payMentId, int bookingId, double finalAmount) {
//        this.payMentId = payMentId;
//        this.bookingId = bookingId;
//        this.finalAmount = finalAmount;
//    }
//
//    // Getters and Setters
//    public int getPayMentId() {
//        return payMentId;
//    }
//
//    public void setPayMentId(int payMentId) {
//        this.payMentId = payMentId;
//    }
//
//    public int getBookingId() {
//        return bookingId;
//    }
//
//    public void setBookingId(int bookingId) {
//        this.bookingId = bookingId;
//    }
//
//    public double getFinalAmount() {
//        return finalAmount;
//    }
//
//    public void setFinalAmount(double finalAmount) {
//        this.finalAmount = finalAmount;
//    }
//
//    @Override
//    public String toString() {
//        return "Payment [payMentId=" + payMentId + ", bookingId=" + bookingId + ", finalAmount=" + finalAmount + "]";
//    }
//
//	public void setPayMentId(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//}
//package com.java.transport.model;
//
//public class payment {
//    private int paymentId;   // Renaming payMentId to paymentId for consistency
//    private int bookingId;
//    private double finalAmount;
//    private String paymentStatus;  // Adding paymentStatus field
//
//    // Default Constructor
//    public payment() {}
//
//    // Parameterized Constructor
//    public payment(int paymentId, int bookingId, double finalAmount, String paymentStatus) {
//        this.paymentId = paymentId;
//        this.bookingId = bookingId;
//        this.finalAmount = finalAmount;
//        this.paymentStatus = paymentStatus;  // Initialize paymentStatus
//    }
//
//    // Getters and Setters
//    public int getPaymentId() {
//        return paymentId;
//    }
//
//    public void setPaymentId(int paymentId) {
//        this.paymentId = paymentId;
//    }
//
//    public int getBookingId() {
//        return bookingId;
//    }
//
//    public void setBookingId(int bookingId) {
//        this.bookingId = bookingId;
//    }
//
//    public double getFinalAmount() {
//        return finalAmount;
//    }
//
//    public void setFinalAmount(double finalAmount) {
//        this.finalAmount = finalAmount;
//    }
//
//    public String getPaymentStatus() {
//        return paymentStatus;
//    }
//
//    public void setPaymentStatus(String paymentStatus) {
//        this.paymentStatus = paymentStatus;
//    }
//
//    @Override
//    public String toString() {
//        return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", finalAmount=" + finalAmount
//                + ", paymentStatus=" + paymentStatus + "]";
//    }
//}
package com.java.transport.model;

public class payment {
    private int paymentId;   // Renaming payMentId to paymentId for consistency
    private int bookingId;
    private double amount;   // Renaming finalAmount to amount for clarity
    private String paymentStatus;  // Adding paymentStatus field

    // Default Constructor
    public payment() {}

    // Parameterized Constructor
    public payment(int paymentId, int bookingId, double amount, String paymentStatus) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;  // Initialize paymentStatus
    }

    // Getters and Setters
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getAmount() {  // Renamed getter for finalAmount
        return amount;
    }

    public void setAmount(double amount) {  // Renamed setter for finalAmount
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", amount=" + amount
                + ", paymentStatus=" + paymentStatus + "]";
    }
}


