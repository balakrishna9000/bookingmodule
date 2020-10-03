package com.dxctraining.booking.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctraining.booking.dao.IBookingDao;
import com.dxctraining.booking.entities.Booking;
import com.dxctraining.booking.exceptions.InvalidArgumentException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class IBookingServiceImpl implements IBookingService {
	
@Autowired
IBookingDao dao;


@Override
public Booking modifyBooking(Booking bookingId) {
	return dao.modifyBooking(bookingId);
	
}

@Override
public Booking viewByBookingId(BigInteger bookingId) {
	validateBooking(bookingId);
	return dao.viewByBookingId(bookingId);
}

@Override
public List<Booking> viewAllBookings(){
	return dao.viewAllBookings();
	
}

@Override
public void deleteBooking (BigInteger bookingId){
	validateBooking (bookingId);
	dao.deleteBooking(bookingId);
}



@Override
public void validateBooking(Object obj) {
	if(obj==null) {
		throw new InvalidArgumentException("given argument is not valid "+obj);
	}
}

@Override
public Booking addBooking(Booking booking) {
	//validateBooking(booking);
	return dao.addBooking(booking);
}
}
