package inheritance2;

public class SUV extends Vehicle {
    private int towCapacity;

    public SUV(int year, String make, String model) {
        super(year, make, model);
        this.towCapacity = 200;
    }

    public int getTowCapacity() { return towCapacity; }
    public void setTowCapacity(int towCapacity) { this.towCapacity = towCapacity; }
}