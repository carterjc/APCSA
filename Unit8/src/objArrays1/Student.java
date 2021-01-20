package objArrays1;

public class Student {
    private static int studentPopulation = 0;

    private String name;
    private double gpa;
    private String favClass;
    private int studentID;
    private Book[] myBooks;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.studentID = studentPopulation;
        studentPopulation++;
        this.myBooks = new Book[5];
    }

    public Student(String name, double gpa, String favClass) {
        this.name = name;
        this.gpa = gpa;
        this.favClass = favClass;
        this.studentID = studentPopulation;
        studentPopulation++;
        this.myBooks = new Book[5];
    }

    public Student() { this.studentID = studentPopulation; studentPopulation++; this.myBooks = new Book[5]; }

    public Student(String name) {
        this.name = name;
        this.studentID = studentPopulation;
        studentPopulation++;
        this.myBooks = new Book[5];
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

    public void rentBook(Book b) {
        int taken = 0;
        for (Book i : this.myBooks) {
            if (i != null) { taken++; }
        }
        if (taken == 5) { System.out.println("Error! 5 books checked out!"); }
        else {
            this.myBooks[taken] = b;
            System.out.println(b.getTitle() + " has been rented!");
        }
    }

    public void displayRentedBooks() {
        for (Book b : this.myBooks) {
            if (b == null) { break; }
            System.out.println("Title: " + b.getTitle() + " - Author: " + b.getAuthor());
        }
    }

}
