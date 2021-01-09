package class2;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(2008, "BMW", "328xi");
        Car car2 = new Car(2020, "BMW", "Z4");
        Car car3 = new Car(2002, "Acura", "MDX");

        System.out.println(car1);
        System.out.println(car3.getModel());
        System.out.println(car2.getMake());

        car1.drive(10);
        car2.drive(15);
        car3.drive(-10);

        Student s1 = new Student("Dennis");
        Student s2 = new Student("Henry");
        Student s3 = new Student("Andrew");
        s1.drive(car1, 10);
        s2.drive(car2, 200);
        s3.drive(car3, 500);
    }
}