public class BAtestDriver {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount();
        double tax = mySavings.calcTax();
        System.out.println(tax);

        SavingsAccount mySavings1 = new SavingsAccount("jason", 12, 1000);
        tax = mySavings1.calcTax();
        System.out.println(mySavings1.accnum);
        System.out.println(mySavings1.balance);
        System.out.println(tax);
    }
}
