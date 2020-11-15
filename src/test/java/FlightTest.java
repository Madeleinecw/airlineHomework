import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger, passenger2;
    FlightManager flightManager;

    @Before
    public void before(){
        passenger = new Passenger("Bob" ,1);
        passenger2 = new Passenger("Sue", 1);
        plane = new Plane(PlaneType.JET);
        flight = new Flight(plane, 555, "Heathrow", "Glasgow", "12:17");
        flightManager = new FlightManager(flight);
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

    @Test
    public void checkBaggageAfterBooking(){
        flight.book(passenger);
        assertEquals(983.34, flightManager.getRemainingBaggageCapacity(), 0.01);
    }

    @Test
    public void checkUsedBaggageAllowance(){
        flight.book(passenger);
        flight.book(passenger2);
        assertEquals(33.33, flightManager.getUsedBaggageAllowance(), 0.01);
    }
}
