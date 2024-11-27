//package com.java.transport.model;
//import com.java.transport.model.booking;
//
//
//import java.sql.Date;
//
//public class booking {
//    private int bookingId;
//    private int customerId;
//    private Date bookingDate;
//    private int journeyId;
//    private Date startDate;
//    private Date endDate;
//    private int noOfDays;
//    private double advanceAmount;
//
//    // Default Constructor
//    public booking() {}
//
//    // Parameterized Constructor
//    public booking(int bookingId, int customerId, Date bookingDate, int journeyId, 
//                   Date startDate, Date endDate, int noOfDays, double advanceAmount) {
//        this.bookingId = bookingId;
//        this.customerId = customerId;
//        this.bookingDate = bookingDate;
//        this.journeyId = journeyId;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.noOfDays = noOfDays;
//        this.advanceAmount = advanceAmount;
//    }
//
//    // Getters and Setters
//    public int getBookingId() {
//        return bookingId;
//    }
//
//    public void setBookingId(int bookingId) {
//        this.bookingId = bookingId;
//    }
//
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public Date getBookingDate() {
//        return bookingDate;
//    }
//
//    public void setBookingDate(Date bookingDate) {
//        this.bookingDate = bookingDate;
//    }
//
//    public int getJourneyId() {
//        return journeyId;
//    }
//
//    public void setJourneyId(int journeyId) {
//        this.journeyId = journeyId;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }
//
//    public int getNoOfDays() {
//        return noOfDays;
//    }
//
//    public void setNoOfDays(int noOfDays) {
//        this.noOfDays = noOfDays;
//    }
//
//    public double getAdvanceAmount() {
//        return advanceAmount;
//    }
//
//    public void setAdvanceAmount(double advanceAmount) {
//        this.advanceAmount = advanceAmount;
//    }
//
//    @Override
//    public String toString() {
//        return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", bookingDate=" + bookingDate + 
//               ", journeyId=" + journeyId + ", startDate=" + startDate + ", endDate=" + endDate + 
//               ", noOfDays=" + noOfDays + ", advanceAmount=" + advanceAmount + "]";
//    }
//}
package com.java.transport.model;
import com.java.transport.model.booking;


import java.sql.Date;

public class booking {
    private int bookingId;
    private int customerId;
    private Date bookingDate;
    private int journeyId;
    private Date startDate;
    private Date endDate;
    private int noOfDays;
    private double advanceAmount;

    // Default Constructor
    public booking() {}

    // Parameterized Constructor
    public booking(int bookingId, int customerId, Date bookingDate, int journeyId, 
                   Date startDate, Date endDate, int noOfDays, double advanceAmount) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.bookingDate = bookingDate;
        this.journeyId = journeyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.noOfDays = noOfDays;
        this.advanceAmount = advanceAmount;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public double getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", bookingDate=" + bookingDate + 
               ", journeyId=" + journeyId + ", startDate=" + startDate + ", endDate=" + endDate + 
               ", noOfDays=" + noOfDays + ", advanceAmount=" + advanceAmount + "]";
    }
}
