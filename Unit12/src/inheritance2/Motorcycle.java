package inheritance2;

public class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(int year, String make, String model) {
        super(year, make, model);
        this.hasHelmet = false;
    }

    public boolean getHasHelmet() { return hasHelmet; }
    public void setHasHelmet(boolean hasHelmet) { this.hasHelmet = hasHelmet; }

    @Override
    public void drive(double miles) {
        if (hasHelmet && getPlateNumber().length() > 1) {
            setMileage(getMileage() + miles);
        }
    }
}
