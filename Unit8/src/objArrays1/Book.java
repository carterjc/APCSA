package objArrays1;

public class Book {
    private String title;
    private String author;
    private String type;
    private int copyYear;

    public Book(String title, String author, String type, int copyYear) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.copyYear = copyYear;
    }

    public Book() {}

    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title;}

    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author;}


    public String getType() { return this.type; }
    public void setType(String type) { this.type = type;}


    public int getcopyYear() { return this.copyYear; }
    public void setCopyYear(int year) { this.copyYear = year;}


    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nType: " + this.type + "\n\u00a9 " + this.copyYear;
    }

    public static boolean searchByTitle(Book[] a, String title) {
        boolean found = false;
        for (Book b : a) {
            if (b.getTitle().equals(title)) { found = true; break; }
        }
        return found;
    }

    public static boolean searchByAuthor(Book[] a, String author) {
        boolean found = false;
        for (Book b : a) {
            if (b.getAuthor().equals(author)) { found = true; break; }
        }
        return found;
    }

    public static void displayAllBooks(Book[] a) {
        for (Book b : a) {
            System.out.println("Title: " + b.getTitle() + " - Author: " + b.getAuthor());
        }
    }

    public static void displayAllBooksByAuthor(Book[] a, String author) {
        boolean found = false;
        for (Book b : a) {
            if (b.getAuthor().equals(author)) {
                found = true;
                System.out.println("Title: " + b.getTitle() + " - Author: " + b.getAuthor());
            }
        }
        if (!found) { System.out.println("Author not found! Error!"); }
    }


}
