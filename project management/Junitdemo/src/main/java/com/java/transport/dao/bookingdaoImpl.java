package com.java.transport.dao;

import com.java.transport.model.booking;
import java.util.List;
import java.util.ArrayList;

public class bookingdaoImpl implements bookingdao {

    private List<booking> bookingList = new ArrayList<>();

    // Method to get all bookings
    @Override
    public List<booking> getAllBookings() {
        return bookingList;
    }

    // Method to get a booking by its ID
    @Override
    public booking getBookingById(int bookingId) {
        for (booking b : bookingList) {
            if (b.getBookingId() == bookingId) {
                return b;
            }
        }
        return null;
    }

    // Method to add a new booking
    @Override
    public boolean addBooking(booking booking) {
        return bookingList.add(booking);
    }

    // Method to update an existing booking
    @Override
    public boolean updateBooking(booking booking) {
        for (int i = 0; i < bookingList.size(); i++) {
            if (bookingList.get(i).getBookingId() == booking.getBookingId()) {
                bookingList.set(i, booking);
                return true;
            }
        }
        return false;
    }

    // Method to delete a booking
    @Override
    public boolean deleteBooking(int bookingId) {
        booking b = getBookingById(bookingId);
        if (b != null) {
            bookingList.remove(b);
            return true;
        }
        return false;
    }

    // Method to check if a booking exists by its ID
    @Override
    public boolean checkBookingById(int bookingId) {
        return getBookingById(bookingId) != null;
    }

    // Method to cancel a booking by its ID
    @Override
    public boolean cancelBooking(int bookingId) {
        return deleteBooking(bookingId);
    }
}

