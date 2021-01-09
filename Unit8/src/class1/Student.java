package class1;

public class Student {
    private static int studentPopulation = 0;

    private String name;
    private double gpa;
    private String favClass;
    private int studentID;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.studentID = studentPopulation;
        studentPopulation++;
    }

    public Student(String name, double gpa, String favClass) {
        this.name = name;
        this.gpa = gpa;
        this.favClass = favClass;
        this.studentID = studentPopulation;
        studentPopulation++;
    }

    public Student() { this.studentID = studentPopulation; studentPopulation++; }

    public Student(String name) {
        this.name = name;
        this.studentID = studentPopulation;
        studentPopulation++;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public double getGPA() { return this.gpa; }

    public void setGPA(double gpa) { this.gpa = gpa; }

    public String getFavClass() { return this.favClass; }

    public void setFavClass(String c) { this.favClass = c; }

    public int getStudentID() { return this.studentID; }


    @Override
    public String toString() {
        return "Name: " + getName() + ", GPA: " + getGPA() + ", Favorite class: " + getFavClass();
    }

    public void sayHello(Student s) {
        if (s.equals(this)) { System.out.println("You can't say hello to yourself!"); }
        else { System.out.println("Hello, " + s.name + "!"); }
    }
}
