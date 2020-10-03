package com.dxctraining.booking.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private  BigInteger bookingId;
	private Integer userId;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="YYYY-MM-dd")
	private Date bookingDate;
	private double ticketCost;
	
	private boolean bookingState;
	
	public Booking() {
		
	}

	public Booking(Integer userId,Date bookingDate, double ticketCost, boolean bookingState) {
		this.userId=userId;
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
