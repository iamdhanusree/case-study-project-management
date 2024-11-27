
package com.java.transport.dao;

import com.java.transport.model.booking;
import java.util.List;

public interface bookingdao {

    // Method to get all bookings
    List<booking> getAllBookings();

    // Method to get a booking by its ID
    booking getBookingById(int bookingId);

    // Method to add a new booking
    boolean addBooking(booking booking);

    // Method to update an existing booking
    boolean updateBooking(booking booking);

    // Method to delete a booking
    boolean deleteBooking(int bookingId);
    
    // New method to check if a booking exists by ID
    boolean checkBookingById(int bookingId);

    // New method to cancel a booking by ID
    boolean cancelBooking(int bookingId);
}
