public class BankAccount{
    protected String name;
    protected int accnum;

    public BankAccount(){
        this("no name", 0);
    }

    public BankAccount(String name, int accnum){
        setName(name);
        setAccnum(accnum);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public String getName() {
        return name;
    }

    public int getAccnum() {
        return accnum;
    }

    public String toString(){
        return "Name : " + name +"\nAccount Number : " + accnum + "\n";
    }


}
