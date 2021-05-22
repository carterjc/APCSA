package inheritance2;

public class Sports extends Vehicle {
    private int topSpeed;

    public Sports(int year, String make, String model) {
        super(year, make, model);
        this.topSpeed = 200;
    }

    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
}