public class ATM {
    double balance = 0;
    Take w = new Take();
    Insert d = new Insert();
    public double Run(int x, double amount) {
        switch(x)
        {
            case 1:
                this.balance = d.deposit(amount,balance);
            case 2:
                this.balance =w.withdraw(amount,balance);
        }return balance;}
    public static void main(String args[] ) {
    }
}
