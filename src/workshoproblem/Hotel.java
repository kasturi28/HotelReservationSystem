package workshoproblem;

public class Hotel {

	private String hotelName;
	private long rate;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public long getRate() {
		return rate;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	
	Hotel(){
		
	}
	
	public Hotel(String hotelName, long rate) {
		this.hotelName = hotelName;
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rate=" + rate + "]";
	}
	
	
}
