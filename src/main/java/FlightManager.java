public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double getPassengerBaggageAllowance(){
        double baggageAllowance = flight.getPassengerBaggageAllowance();
       return baggageAllowance;
    }

    public double getRemainingBaggageCapacity(){
        double personalAllowance = flight.getPassengerBaggageAllowance();
        double baggageWeight = flight.getPassengerNumbers() * personalAllowance;
        double remainingCapacity = flight.getBaggageCapacity() - baggageWeight;
        return remainingCapacity;
    }

    public double getUsedBaggageAllowance() {
        double allowance = flight.getPassengerNumbers() * flight.getPassengerBaggageAllowance();
        return allowance;
    }
}
