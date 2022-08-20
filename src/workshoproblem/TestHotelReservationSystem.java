package workshoproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestHotelReservationSystem {
	@Test
    public void givenListOfHotelsAndPriceListWhenAddedToListShouldReturnListOfHotels(){
        Hotel hotel1 = new Hotel("Lakeewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        HotelReservationMethod reserve = new HotelReservationMethod();
        reserve.addHotel(hotel1);
        reserve.addHotel(hotel2);
        reserve.addHotel(hotel3);
        List<Hotel> hotels = Arrays.asList(hotel1,hotel2,hotel3);
        List<Hotel> result = reserve.getHotels();
        Assert.assertEquals(result,hotels);
    }


    @Test
    public void givenListOfHotelsAndPriceListWhenDatesGivenShouldReturnCheapestHotel(){
        Hotel hotel1 = new Hotel("Lakeewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        HotelReservationMethod reserve1 = new HotelReservationMethod();
        reserve1.addHotel(hotel1);
        reserve1.addHotel(hotel2);
        reserve1.addHotel(hotel3);
        Map<String, Integer> result = reserve1.searchFor("10Sep2020", "11Sep2020");
        result.forEach((k, v) -> System.out.println(k+ " " + v));
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Lakeewood",220);
        Assert.assertEquals(result,expected);
    }

}
