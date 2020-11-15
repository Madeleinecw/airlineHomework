public enum PlaneType {
    JET(60, 2000),
    BOEING747(75, 3000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight(){
        return weight;
    }
}
