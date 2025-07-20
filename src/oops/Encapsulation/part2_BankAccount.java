package oops.Encapsulation;

class BankAccount{
    private long accountNumber;
    private double balance;

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited amount " + amount);
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrew " + amount);
        }else{
            System.out.println("Withdraw unsuccessfull");
        }
    }
}
public class part2_BankAccount{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(12200);
        b.setBalance(1200);

        b.withdraw(1190);
        System.out.println(b.getBalance());
        b.withdraw(20);
        System.out.println(b.getBalance());
    }
}
