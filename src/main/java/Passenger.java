public class Passenger {

    private String name;
    private int noOfBags;

    public Passenger(String name, int noOfBags){
        this.name = name;
        this.noOfBags = noOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }
}
