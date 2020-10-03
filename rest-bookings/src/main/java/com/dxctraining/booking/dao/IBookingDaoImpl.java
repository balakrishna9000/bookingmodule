package com.dxctraining.booking.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.booking.entities.Booking;
import com.dxctraining.booking.exceptions.BookingNotFoundException;

@Repository
public class IBookingDaoImpl implements IBookingDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public Booking modifyBooking(Booking booking) {
		booking=entityManager.merge(booking);
		return booking;
	}
	
	@Override
	public Booking viewByBookingId(BigInteger bookingId) {
		Booking booking =entityManager.find(Booking.class,bookingId);
		if(booking==null) {
			throw new BookingNotFoundException("booking not found for id =" +bookingId);
		}
		//List <Booking>list=new ArrayList<Booking>();
		//list.add(booking);

		return booking;
	}
	

	@Override
	public List<Booking> viewAllBookings() {
		String jpaql ="from Booking";
		TypedQuery<Booking>query=entityManager.createQuery(jpaql,Booking.class);
		List<Booking>bookingList=query.getResultList();
         
		return bookingList;
	}


	@Override
	public void deleteBooking(BigInteger bookingId) {
		Booking booking= viewByBookingId(bookingId);
		entityManager.remove(booking);
 		
	}



	@Override
	public Booking addBooking(Booking booking) {
		entityManager.persist(booking);
		System.out.println("booking");
		return booking ;
	}
}
