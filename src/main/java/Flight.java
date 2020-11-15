import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departurePort;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, int flightNumber, String destination, String departurePort, String departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departurePort = departurePort;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getPassengerNumbers(){
        return passengers.size();
    }

    public void book(Passenger passenger){
        passengers.add(passenger);
    }

    public int availableSeats(){
        int seats = plane.getCapacity() - passengers.size();
        return seats;
    }

    public double getPassengerBaggageAllowance(){
        double allowance = plane.getBaggageCapacity() / passengers.size();
        return allowance;
    }
}
