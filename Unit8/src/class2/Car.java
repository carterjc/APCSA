package class2;

public class Car {
    private int year;
    private String make;
    private String model;
    private int miles;

    public Car(int year, String make, String model){
        this.miles = 0;
        this.year = year;
        this.make = make;
        this.model = model;
    }
    public int getYear() { return this.year; }
    public int getMiles() { return this.miles; }
    public String getMake() { return this.make; }
    public String getModel() { return this.model; }
    public void setYear(int year) { this.year = year; }
    public void setMiles(int miles) { this.miles = miles; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }

    @Override
    public String toString(){
        return "Car model: " + getModel() + ", Car make: " + getMake() + ". year: " + getYear() + ", Miles: " + getMiles();
    }

    public void drive(int miles) {
        if (miles > 0) {
            setMiles(getMiles() + miles);
            System.out.println("the " + getModel() + " drove " + getMiles() + " miles");
        } else {
            System.out.println("You cannot drive negative miles");
        }
    }
}
