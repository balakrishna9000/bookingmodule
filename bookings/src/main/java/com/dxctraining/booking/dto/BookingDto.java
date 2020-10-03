package com.dxctraining.booking.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class BookingDto {
    private  BigInteger bookingId;
	
	private Integer userId;
	
	private Date bookingDate;
	
	private double ticketCost;
	
	private boolean bookingState;

	public BookingDto(BigInteger bookingId,Integer userId,Date bookingDate, double ticketCost,boolean bookingState) {
		this.userId=userId;
		this.bookingId=bookingId;
		this.bookingDate=bookingDate;
		this.ticketCost=ticketCost;
		this.bookingState=bookingState;

	}

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public boolean isBookingState() {
		return bookingState;
	}

	public void setBookingState(boolean bookingState) {
		this.bookingState = bookingState;
	}
}
