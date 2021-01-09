package class3;


public class BankMain {
    public static void pretty(String s){
        System.out.println("\n----" + s + "----\n");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Carter", 1.0, "Computer Science");
        Student s2 = new Student("Kate", 0.9);
        Student s3 = new Student("Jake");
        Student s4 = new Student();

        pretty("Check Balances");

        s1.displayBalance();
        s2.displayBalance();
        s3.displayBalance();
        s4.displayBalance();

        pretty("Check Account Nums");

        s1.displayAccountNum();
        s2.displayAccountNum();
        s3.displayAccountNum();
        s4.displayAccountNum();

        pretty("Deposit Methods");

        s1.deposit(100);
        s2.deposit(2000);
        s3.deposit(500);
        s4.deposit(-5);

        pretty("Check Balances");

        s1.displayBalance();
        s2.displayBalance();
        s3.displayBalance();
        s4.displayBalance();

        pretty("Withdraw Methods");

        s1.withdraw(99);
        s2.withdraw(5);
        s3.withdraw(400);
        s4.withdraw(1);

        pretty("Check Balances");

        s1.displayBalance();
        s2.displayBalance();
        s3.displayBalance();
        s4.displayBalance();
    }

}