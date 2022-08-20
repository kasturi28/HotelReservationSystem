package workshoproblem;

public class Hotel {

	private String name;
	private int regularWeekdayRate;
	private int regularWeekendRate;
	

	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}



	Hotel() {

	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", regularWeekdayRate=" + regularWeekdayRate + ", regularWeekendRate="
				+ regularWeekendRate + "]";
	}

	
}
