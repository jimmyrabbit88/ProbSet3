public class SavingsAccount {
    private double balance;

    public SavingsAccount(){
        balance = 0;
    }

    public SavingsAccount(double amount, String name){
        setBalance(amount);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
