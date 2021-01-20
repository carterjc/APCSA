package arrayList1;

import java.util.ArrayList;

public class arrayList1 {
    static void pretty(String s) { System.out.print("\n\n----" + s + "----\n\n"); }
    static void printArray(ArrayList<String> a) { for (String c : a) { System.out.print(c + " "); } }
    // Interesting type erasure issue, not sure perfect solution
    static void printIntArray(ArrayList<Integer> a) { for (int c : a) { System.out.print(c + " "); } }
    static void searchArrayList(ArrayList<String> a, String target) {
        boolean found = false;
        for (String c : a) {
            if (c.equals(target)) { found = true; break; }
        }
        System.out.print(found ? "Found: " + a.indexOf(target) : "Not Found");
    }
    static void searchArrayList(ArrayList<Integer> a, int target) {
        boolean found = false;
        for (int c : a) {
            if (c == target) { found = true; break; }
        }
        System.out.print(found ? "Found: " + a.indexOf(target) : "Not Found");
    }
    public static void main(String[] args) {
        // Part 1
        // Create a new String ArrayList ‘colorList’
        ArrayList<String> colorList = new ArrayList<>();
        // Add three colors to the list => Orange, Yellow, Blue
        colorList.add("Orange");
        colorList.add("Yellow");
        colorList.add("Blue");

        // Print the size of the ArrayList
        pretty("Size of colorList");
        System.out.println("Size: " + colorList.size());

        // Print the element at index 2
        pretty("Element at index 2");
        System.out.println("Element at index 2: " + colorList.get(2));

        // Print the index of “Orange”
        pretty("Index of Orange");
        System.out.println("Index of orange: " + colorList.indexOf("Orange"));

        // Part 2
        // Create an enhanced for loop to print colorList
        pretty("Print with enhanced loop");
        for (String c : colorList) { System.out.print(c + " "); }

        // Create a traditional for loop to print colorList
        pretty("Print with traditional loop");
        for (int i = 0; i < colorList.size(); i++) { System.out.print(colorList.get(i) + " "); }

        // Print the object colorList
        pretty("colorList Object");
        System.out.println(colorList);

        // Part 3
        // Insert a color at index 0 => Red
        colorList.add(0, "Red");

        // Print the ArrayList
        pretty("Print Array - Add 'Red'");
        printArray(colorList);

        // Change “Blue” to “Green”
        colorList.set(colorList.indexOf("Blue"), "Green");

        // Print the ArrayList
        pretty("Print Array - Change Blue to Green");
        printArray(colorList);

        // Add more colors to the list => Blue, Indigo, Violet, Brown, Black
        colorList.add("Blue");
        colorList.add("Indigo");
        colorList.add("Violet");
        colorList.add("Brown");
        colorList.add("Black");

        // Print the ArrayList
        pretty("Print Array - Add Colors");
        printArray(colorList);

        // Remove “Black”
        colorList.remove("Black");

        // Print the size of the ArrayList
        pretty("Print Size - Removed Black");
        System.out.println("Size: " + colorList.size());

        // Print the ArrayList
        pretty("Print Array - Removed Black");
        printArray(colorList);

        // Remove the last element
        colorList.remove(colorList.size() - 1);

        // Print the size of the ArrayList
        pretty("Print Size - Removed Last Element");
        System.out.println("Size: " + colorList.size());

        // Print the ArrayList
        pretty("Print Array");
        printArray(colorList);

        // Part 4
        // Create a static void method searchArrayList(ArrayList arr, String
        // target) that will perform a linear search for the first instance of
        // a desired target.
        // This method will print. Found or Not Found and print an index if
        // found.
        // Overload this method to handle integers
        // Search for Blue and Maroon

        pretty("Search for Blue");
        searchArrayList(colorList, "Blue");

        pretty("Search for Maroon");
        searchArrayList(colorList, "Maroon");

        // Part 5
        // Create an integer ArrayList numberList
        ArrayList<Integer> numberList = new ArrayList<>();

        // Populate with 10 random numbers less than 100
        for (int i = 0; i < 10; i++) { numberList.add((int) (Math.random() * 100) + 1); }

        // Print the ArrayList
        pretty("Print Array");
        printIntArray(numberList);

        // Create a loop to print only the even indices
        pretty("Print even indices");
        for (int i = 0; i < numberList.size(); i += 2) { System.out.print(numberList.get(i) + " "); }

        // Create a loop to print only the odd indices
        pretty("Print odd indices");
        for (int i = 1; i < numberList.size(); i += 2) { System.out.print(numberList.get(i) + " "); }

        // Create a loop to print only the even elements
        pretty("Print even elements");
        for (int a : numberList) {
            if (a % 2 == 0) { System.out.print(a + " "); }
        }

        // Create a loop to print only the odd elements
        pretty("Print odd elements");
        for (int a : numberList) {
            if (a % 2 == 1) { System.out.print(a + " "); }
        }

        // Using searchArrayList() search for 10, 20, 30 and your favorite
        // number
        pretty("Search for 10");
        searchArrayList(numberList, 10);

        pretty("Search for 20");
        searchArrayList(numberList, 20);

        pretty("Search for 30");
        searchArrayList(numberList, 30);

        pretty("Search for 15");
        searchArrayList(numberList, 15);

        // Remove any five elements
        numberList.remove(0);
        numberList.remove(0);
        numberList.remove(0);
        numberList.remove(0);
        numberList.remove(0);

        // Print the ArrayList
        pretty("Print Array - Removed first 5 elements");
        printIntArray(numberList);

        // Part 6
        // Create a file Student.java and copy the code from [here]
        // Create a Student ArrayList studentList
        ArrayList<Student> studentList = new ArrayList<Student>();
        // Populate with at least 5 Students
        studentList.add(new Student("Carter", 1.0, "Computer Science"));
        studentList.add(new Student("Kate", 0.9));
        studentList.add(new Student("Jake"));
        studentList.add(new Student("Ari"));
        studentList.add(new Student("Brooke"));

        // Create a loop that will call the sayHello() method for each Student
        pretty("Loop through Students and sayHello()");
        for (Student s : studentList) { s.sayHello(); }
    }
}
