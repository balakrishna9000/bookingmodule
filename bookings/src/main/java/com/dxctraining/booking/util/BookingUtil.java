package com.dxctraining.booking.util;

import com.dxctraining.booking.dto.BookingDto;
import com.dxctraining.booking.entities.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingUtil {
	
	public BookingDto bookingDto(Booking booking) {
		BookingDto dto=new BookingDto(booking.getBookingId(),booking.getUserId(),booking.getBookingDate(),booking.getTicketCost(),
				booking.isBookingState());
		return dto;
		
	}
}

