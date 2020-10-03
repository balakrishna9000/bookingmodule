package com.dxctraining.booking.dao;

import java.math.BigInteger;
import java.util.List;

import com.dxctraining.booking.entities.Booking;

public interface IBookingDao {
	Booking addBooking(Booking booking);
	
	Booking modifyBooking(Booking booking);
	
	Booking viewByBookingId(BigInteger bookingId);
	
	List<Booking>viewAllBookings();
	
	void deleteBooking (BigInteger bookingId);
	
	
	

}
