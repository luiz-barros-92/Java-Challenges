package bankAccount;

public class Account {
    private int number;
    private String holder;
    private double balance;    
    
    public Account (int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    
    public Account (int number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit (double value) {
        this.balance = this.getBalance() + value;
        System.out.println("Updated account data:");
    }
    
    public void withdraw (double value) {
        if ((this.getBalance() - 5) >= value) {
            this.balance = (this.getBalance() - value) - 5; //bank fee $5
        } else {
            System.out.println("Sorry, you don't have enough balance.");
        }
    }
}
