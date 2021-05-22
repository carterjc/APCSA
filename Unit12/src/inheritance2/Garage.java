package inheritance2;

import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicles() { return vehicles; }
    public void addVehicles(Vehicle vehicle) { this.vehicles.add(vehicle); }

    public static void main(String[] args) {
        Garage g = new Garage();
        g.addVehicles(new Motorcycle(2021, "Standard", "Triumph Street Twin"));
        g.addVehicles(new Motorcycle(2021, "Sport", " Kawasaki Ninja"));
        g.addVehicles(new SUV(2021, "Base", "Honda CR-V"));
        g.addVehicles(new Sedan(2021, "Luxury", "Acura TLX"));
        g.addVehicles(new Sports(2021, "Base", "Chevrolet Camaro"));
        for (Vehicle v : g.getVehicles()) {
            v.setPlateNumber(v.getMake().substring(1, 3) + "1234");
            v.drive((Math.random() * 100) + 1);
        }
    }
}
