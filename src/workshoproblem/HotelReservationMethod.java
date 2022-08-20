package workshoproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationMethod {
	/*
	 * using scanner to take inputs from the user
	 * creating arraylist of hotel
	 * taking inputs for hotelname & rate from the user
	 */
	Scanner sc = new Scanner(System.in);
	static ArrayList<Hotel> list = new ArrayList<>();

	public void newHotel() {

		System.out.println("Enter hotel name");
		String hotelName = sc.next();

		System.out.println("Enter rate for the hotel");
		long rate = sc.nextLong();
		
		Hotel hotel = new Hotel(hotelName, rate);

		list.add(hotel);

}
	
}