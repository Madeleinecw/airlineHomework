import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob" ,2);
        plane = new Plane(PlaneType.JET);
        flight = new Flight(plane, 555, "Heathrow", "Glasgow", "12:17");
    }

    @Test
    public void checkCapacity(){
        assertEquals(60, plane.getCapacity());
    }

    @Test
    public void canAddPassengers(){
        flight.book(passenger);
        assertEquals(1, flight.getPassengerNumbers());
    }

    @Test
    public void checkAvailableSeats(){
        flight.book(passenger);
        assertEquals(59, flight.availableSeats());
    }

    @Test
    public void checkBaggageAllowance(){
        assertEquals(16.66, flight.getPassengerBaggageAllowance(), 0.01);
    }


}
