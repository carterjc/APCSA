package class3;

public class BankAccount {
    private static int totalaccounts = 0;
    private double balance;
    private int accountNum;

    public BankAccount() {
        this.balance = 0;
        this.accountNum = totalaccounts;
        totalaccounts++;
    }

    public double getBalance() { return this.balance; }
    public int getAccountNum() { return this.accountNum; }
    public int getTotalAccounts(){ return totalaccounts; }
    public void setBalance(double balance) { this.balance = balance; }
}
