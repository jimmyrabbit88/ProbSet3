public class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(){
        this ("no Name", 0, 0 );
    }

    public SavingsAccount(String name, int accnum, double amount){
        super (name, accnum);
        setBalance(amount);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void lodge(double amount) {
        this.balance = this.balance + amount;

    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double calcTax() {
        double tax;
        double rate = .03;
        tax = getBalance()*rate;
        return tax;
    }
}
