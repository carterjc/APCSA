package arrayListProj;

import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
    static ArrayList<Game> gameList = new ArrayList<>();
    static void pretty(String s) { System.out.print("\n\n----" + s + "----\n\n"); }
    static void addGame() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title of the game you want to add: ");
        String title = scan.next();

        System.out.println("Enter the genre of the game you want to add: ");
        String genre = scan.next();

        System.out.println("Enter the price of the game you want to add: ");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity of the game you want to add: ");
        int quant = scan.nextInt();

        Game a = new Game(title, genre, price, quant);
        Game.addProduct(gameList, a);
        System.out.println("Game successfully added.");
    }
    static void deleteGame() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title of the game you want to remove: ");
        String title = scan.next();
        Game.removeProduct(gameList, title);
    }
    static void edit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title of the game you want to edit: ");
        String t = scan.next();

        if (Game.searchProduct(gameList, t)) {
            Game g = new Game();
            for (Game b : gameList) {
                if (b.getTitle().equals(t)) {
                    g = b;
                }
            }

            System.out.println("Current info:\n"  + g);

            System.out.println("Enter the new title: ");
            t = scan.next();

            System.out.println("Enter the new genre");
            String genre = scan.next();

            System.out.println("Enter the new price: ");
            double price = scan.nextDouble();

            System.out.println("Enter the new quantity: ");
            int quant = scan.nextInt();

            Game.edit(t, genre, price, quant, g);
        }
    }
    static void searchProduct() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title of the game you want to search for: ");
        String title = scan.next();

        System.out.println(Game.searchProduct(gameList, title) ? "Game found." : "Game not found.");
    }
    static void categoryList() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the category to filter by: ");
        String genre = scan.next();

        Game.listProducts(gameList, genre);
    }
    static void menu() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("(1) - Add Products\n(2) - Remove Products\n(3) - Search for product\n(4) - " +
                    "Edit products\n(5) - List products\n(6) - List products by category\n(7) - Exit\n\nEnter: ");
            int choice = scan.nextInt();
            pretty("Entering");
            switch (choice) {
                case 1 -> addGame();
                case 2 -> deleteGame();
                case 3 -> searchProduct();
                case 4 -> edit();
                case 5 -> Game.listProducts(gameList);
                case 6 -> categoryList();
                default -> {
                    System.out.println("Logging out.");
                    exit = true;
                }
            }
            pretty("Returning");
        }


    }

    public static void main(String[] args) {
        // I stole these from dennis
        gameList.add((new Game("Halo", "FPS", 10, 100)));
        gameList.add((new Game("Halo 2", "FPS", 30, 250)));
        gameList.add((new Game("Halo 3", "FPS", 45, 500)));
        gameList.add((new Game("Halo 4", "FPS", 75, 1000)));
        gameList.add((new Game("C.O.D", "FPS", 75, 500)));
        gameList.add((new Game("Earthbound", "RPG", 54, 12)));
        gameList.add((new Game("Mother 3", "RPG", 32, 9)));
        gameList.add((new Game("Final Fantasy", "RPG", 45, 231)));
        gameList.add((new Game("FF XIV", "RPG", 25, 5600)));
        gameList.add((new Game("FF II", "RPG", 15, 6600)));
        gameList.add((new Game("Terraria", "Sandbox", 25, 12312)));
        gameList.add((new Game("Minecraft", "Sandbox", 29, 32000)));
        gameList.add((new Game("Scribblenauts", "Sandbox", 0, 2311)));
        gameList.add((new Game("Scribblenauts Reloaded", "Sandbox", 0, 50)));
        gameList.add((new Game("Garry's Mod", "Sandbox", 10, 461584)));
        gameList.add((new Game("2048", "Puzzle", 0, 99999)));
        gameList.add((new Game("Candy Crush", "Puzzle", 0, 99999)));
        gameList.add((new Game("Virtual Soduku", "Puzzle", 0, 99999)));
        gameList.add((new Game("Virtual Wordsearch", "Puzzle", 0, 99999)));
        gameList.add((new Game("Minesweeper", "Puzzle", 0, 99999)));
        menu();
    }
}
