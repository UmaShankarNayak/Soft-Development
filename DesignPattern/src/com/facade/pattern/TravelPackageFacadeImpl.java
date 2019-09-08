package com.facade.pattern;

public class TravelPackageFacadeImpl implements TravelPackageFacade{

	@Override
	public void book() {
		
		FlightBooking flightBooking=new FlightBookingImpl();
		flightBooking.book();
		
		HotelBooking hotelBooking=new HotelBookingImpl();
		hotelBooking.book();
		
		TrasferBooking trasferBooking=new TrasferBookingImpl();
		trasferBooking.book();

		
	}

}
