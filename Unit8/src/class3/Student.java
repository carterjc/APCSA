package class3;

public class Student {
    private static int studentPopulation = 0;

    private String name;
    private double gpa;
    private String favClass;
    private int studentID;
    BankAccount acct = new BankAccount();

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

    public void deposit(int d) {
        if (d > 1 && d < 1000) {
            acct.setBalance(acct.getBalance() + d);
            System.out.println("Success!");
        }
        else { System.out.println("Error!"); }
    }

    public void withdraw(int w) {
        if (w > 1 && w < acct.getBalance()) {
            acct.setBalance(acct.getBalance() - w);
            System.out.println("Success!");
        }
        else { System.out.println("Error!"); }
    }

    public void displayBalance() { System.out.println(acct.getBalance()); }
    public void displayAccountNum() { System.out.println(acct.getAccountNum()); }
}
