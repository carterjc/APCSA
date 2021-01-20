package objArrays1;

public class BookMain {
    static void pretty(String s) { System.out.print("\n\n----" + s + "----\n\n"); }
    public static void main(String[] args) {
        // Create 5 books by instantiating book objects
        Book b1 = new Book("A Farewell to Arms", "Ernest Hemingway", "Fiction", 1929);
        Book b2 = new Book("The Grapes of Wrath", "John Steinbeck", "Fiction", 1939);
        Book b3 = new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 1985);
        Book b4 = new Book("Dune", "Frank Herbet", "Science Fiction", 1965);
        Book b5 = new Book("As I Lay Dying", "William Faulkner", "Fiction", 1930);

        // Print any three books
        pretty("Print 3 books");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Print the titles of your first and second books
        pretty("Print Titles of 1st and 2nd");
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Title: " + b2.getTitle());

        // Print the authors of your third and fourth books
        pretty("Print Authors of 3rd and 4th");
        System.out.println("Author: " + b3.getAuthor());
        System.out.println("Author: " + b4.getAuthor());

        // Print the copyright year of your fifth book
        pretty("Print copyright year of 5th");
        System.out.println("Copyright year: " + b5.getcopyYear());

        // Create an array of Book objects, bookArray, of length 10

        Book[] bookArray = new Book[10];

        // Add your first five books to the array

        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;
        bookArray[3] = b4;
        bookArray[4] = b5;

        // Create five new books array elements by adding them to the final
        // five indices

        bookArray[5] = new Book("To Kill a Mockingbird", "Harper Lee", "Novel", 1960);
        bookArray[6] = new Book("To The Last Man", "Jeff Shaara", "Historical Fiction", 2004);
        bookArray[7] = new Book("Of Mice and Men", "John Steinbeck", "Novel", 1937);
        bookArray[8] = new Book("The Red Pony", "John Steinbeck", "Novel", 1933);
        bookArray[9] = new Book("East of Eden", "John Steinbeck", "Novel", 1952);

        // Print the type of books located at index 5 and 6
        pretty("Genre of 5th and 6th");
        System.out.println("Genre: " + bookArray[5].getType());
        System.out.println("Genre: " + bookArray[6].getType());

        // Create a loop that will print all books
        pretty("Print all books");
        for (Book b : bookArray) { System.out.println(b); }

        // Create a loop that will only print book titles
        pretty("Print only book titles");
        for (Book b : bookArray) { System.out.println(b.getTitle()); }

        // Create a loop that will print a book number, book title, and book
        // author
        pretty("Print book number, title, and author");
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(i + " - " + bookArray[i].getTitle() + " - " + bookArray[i].getAuthor());
        }

        // Create a loop that only prints fiction books
        pretty("Print all fiction books");
        for (Book b : bookArray) {
            if (b.getType().equals("Fiction")) {
                System.out.println(b);
            }
        }

        // Create a loop that only prints non-fiction books
        pretty("Print all nonfiction books");
        for (Book b : bookArray) {
            if (b.getType().equals("Non-fiction")) {
                System.out.println(b);
            }
        }
        // Create a loop that only prints books copyrighted after 1950
        pretty("Print all books published after 1950");
        for (Book b : bookArray) {
            if (b.getcopyYear() > 1950) {
                System.out.println(b);
            }
        }

        // Search for a book title with a ‘case-correct’ title argument
        pretty("Book Title Search - Case Correct");
        System.out.println(Book.searchByTitle(bookArray, "Of Mice and Men"));

        // Search for a book title with a ‘case-incorrect’ title argument
        pretty("Book Title Search - Case Incorrect");
        System.out.println(Book.searchByTitle(bookArray, "of mice and men"));

        // Search for a book title that is not in bookArray
        pretty("Book Title Search - Book not Included");
        System.out.println(Book.searchByTitle(bookArray, "Of Mice and Women"));

        // Search for a book author with a ‘case-correct’ author argument
        pretty("Book Author Search - Case Correct");
        System.out.println(Book.searchByAuthor(bookArray, "John Steinbeck"));

        // Search for a book author with a ‘case-incorrect’ author argument
        pretty("Book Author Search - Case Incorrect");
        System.out.println(Book.searchByAuthor(bookArray, "john steinbeck"));

        // Search for a book author that is not in bookArray
        pretty("Book Author Search - Author not Included");
        System.out.println(Book.searchByAuthor(bookArray, "Josh Steinbeck"));

        // Display all books by three different authors
        pretty("Displaying books by: John Steinbeck");
        Book.displayAllBooksByAuthor(bookArray, "John Steinbeck");

        pretty("Displaying books by: William Faulkner");
        Book.displayAllBooksByAuthor(bookArray, "William Faulkner");

        pretty("Displaying books by: Ernest Hemingway");
        Book.displayAllBooksByAuthor(bookArray, "Ernest Hemingway");

        Student s1 = new Student("Carter");
        pretty("Rent 3 books");
        s1.rentBook(b1);
        s1.rentBook(b2);
        s1.rentBook(b3);

        pretty("Display all rented books");
        s1.displayRentedBooks();

        pretty("Rent 2 books");
        s1.rentBook(b4);
        s1.rentBook(b5);

        pretty("Display all rented books");
        s1.displayRentedBooks();

        pretty("Attempt to rent another book");
        s1.rentBook(bookArray[5]);
    }
}
