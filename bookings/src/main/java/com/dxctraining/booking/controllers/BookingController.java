package com.dxctraining.booking.controllers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.booking.dto.BookingDto;
import com.dxctraining.booking.dto.CreateBookingRequest;
import com.dxctraining.booking.entities.Booking;
import com.dxctraining.booking.service.IBookingService;
import com.dxctraining.booking.util.BookingUtil;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	private IBookingService service;
	
	@Autowired
	private BookingUtil util;

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/add")
	
	@ResponseStatus(HttpStatus.CREATED)
	
	public BookingDto create(@RequestBody CreateBookingRequest requestData) {
		Integer id=requestData.getUserId();
		Date bookingDate=requestData.getBookingDate();
		Double ticketCost=requestData.getTicketCost();
		boolean bookingState= requestData.getBookingState();
		Booking booking= new Booking(id,bookingDate,ticketCost,bookingState);
		
		booking= service.addBooking(booking);
		BookingDto response= util.bookingDto(booking);
		return response;		
		
	}
	@DeleteMapping("/delete/{bookingId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteBookingId(@PathVariable("bookingId")BigInteger bookingId) {
	service.deleteBooking(bookingId);	
	}
	
	
	@GetMapping("/get/{bookingId}")
	@ResponseStatus(HttpStatus.OK)
	public BookingDto viewBy(@PathVariable("bookingId")BigInteger bookingId) {
		Booking booking = service.viewByBookingId(bookingId);
		BookingDto response = util.bookingDto(booking);
		return response;
		
	}
	@GetMapping
	public List<BookingDto> fetchAll() {
		System.out.println("in the fetch all method");
		List<Booking> list = service.viewAllBookings();
		List<BookingDto>response=new ArrayList<>();
		for (Booking booking:list){
			BookingDto dto= util.bookingDto(booking);
			response.add(dto);
		}
		return response;
	}




}