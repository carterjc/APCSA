package arrayListProj;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    public static int count;

    private String title;
    private String genre;
    private double price;
    private int quant;
    private int id;

    public Game(String title, String genre, double price, int quant) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.quant = quant;
        this.id = Game.count;
        Game.count++;
    }

    public Game() {}

    public static void addProduct() {
    }

    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return this.genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuant() { return this.quant; }
    public void setQuant(int quant) { this.quant = quant; }

    public int getId() { return this.id; }

    public static void addProduct(ArrayList<Game> a, Game g) {
        a.add(g);
    }

    public static void removeProduct(ArrayList<Game> a, String g) {
        boolean removed = false;
        for (Game b : a) {
            if (b.title.equals(g)) {
                a.remove(b);
                System.out.println("Removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) { System.out.println("Operation failed."); }
    }

    public static boolean searchProduct(ArrayList<Game> a, String g) {
        boolean found = false;
        for (Game b : a) {
            if (b.title.equals(g)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void listProducts(ArrayList<Game> a) {
        if (a.size() == 0) { System.out.println("No games found."); return; }
        for (Game b : a) { System.out.println(b); }
    }

    public static void listProducts(ArrayList<Game> a, String genre) {
        if (a.size() == 0) { System.out.println("No games found."); return; }
        for (Game b : a) {
            if (b.genre.equals(genre)) {
                System.out.println(b);
            }
        }
    }

    public static void edit(String t, String c, double p, int q, Game g) {
        g.setTitle(t);
        g.setGenre(c);
        g.setPrice(p);
        g.setQuant(q);
        System.out.println("Game edited successfully.");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nGenre: " + this.genre + "\nPrice: " + this.price + "$\nQuantity: " + this.quant + "\n";
    }
}
