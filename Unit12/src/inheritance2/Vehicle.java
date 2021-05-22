package inheritance2;

public class Vehicle implements Registration {
    private int year;
    private String make;
    private String model;
    private double mileage;
    private String plateNumber;

    public Vehicle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = 0.0;
        this.plateNumber = "";
    }

    public void drive(double miles) {
        if (this.plateNumber.length() > 1) {
            this.mileage += miles;
        }
    }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    @Override
    public String toString() {
        String res = "Year: " + this.year + "\nMake, Model: " + this.make + ", " + this.model +
                "\nMileage: " + this.mileage;
        if (this.plateNumber.length() > 1) { res = res + "\nPlate Number: " + this.plateNumber; }
        else { res = res + "\nNo Plate Number"; }
        return res;
    }

    public int compareTo(Vehicle a) {
        if (this.mileage > a.mileage) return 1;
        if (this.mileage < a.mileage) return -1;
        else return 0;
    }

}
