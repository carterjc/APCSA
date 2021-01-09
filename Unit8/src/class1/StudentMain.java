package class1;

public class StudentMain {
    public static void main(String[] args) {
        // Instantiates student objects
        Student s1 = new Student("Jake", 2.0);
        Student s2 = new Student("Ari", 4.0);
        Student s3 = new Student("Brooke", 1.0);

        // Print s1
        System.out.println(s1);
        // Print only the name of s2
        System.out.println(s2.getName());
        // Print the GPA of s3
        System.out.println(s3.getGPA());
        // Change the name of s1
        s1.setName("Jake Cohen");
        // Change the GPA of s2
        s2.setGPA(4.1);
        // Call sayHello() using s3 and s1
        s3.sayHello(s1);

        // Instantiate objects s4 and s5 and provide a favClass
        Student s4 = new Student("Smiffen", 0.7, "Math");
        Student s5 = new Student("Carter", 100.0, "Any class Milonas teaches"); // accurate
        // Print s4
        System.out.println(s4);
        // Print name and favClass for s5
        System.out.println(s5.getName());
        System.out.println(s5.getFavClass());
        // Provide s1-s3 with a favClass
        s1.setFavClass("Science");
        s2.setFavClass("Lunch");
        s3.setFavClass("Gym");

        // Instantiate object s6 with no arguments
        Student s6 = new Student();
        // Print s6
        System.out.println(s6);
        // Provide s6 with a name, GPA, and favClass
        s6.setName("Mark");
        s6.setGPA(3.8);
        s6.setFavClass("Foods");
        // Print s6
        System.out.println(s6);
        // Instantiate object s7 with only a name argument
        Student s7 = new Student("Miguel");
        // Print s7
        System.out.println(s7);
        // Provide s7 with a GPA and favClass
        s7.setGPA(3.8);
        s7.setFavClass("Foods");
        // Print s7
        System.out.println(s7);

        System.out.println(s7.getStudentID());
    }
}
