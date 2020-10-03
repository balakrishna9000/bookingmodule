package com.dxctraining.booking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class CreateBookingRequest {
private  BigInteger bookingId;
	
	private Integer userId;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date bookingDate;
		
	private double ticketCost;
	
	private boolean bookingState;
	

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

	public boolean isBookingState() {
		return bookingState;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
public boolean getBookingState() {
		return bookingState;
	}

	public void setBookingState(boolean bookingState) {
		this.bookingState = bookingState;
	}


}
