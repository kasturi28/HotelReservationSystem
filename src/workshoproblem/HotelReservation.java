package workshoproblem;

public class HotelReservation {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Printing the welcome message
		 * creating object for the hoterlreservationmethod
		 * calling newhotel method to add the hotel
		 */
		System.out.println("Welcome to Hotel reservation program....");
		
		HotelReservationMethod u1 = new HotelReservationMethod();
		u1.newHotel();
		System.out.println(HotelReservationMethod.list);

	}

}
