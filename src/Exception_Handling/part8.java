package Exception_Handling;

class BankAccount{
    private double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }
}

// custom exception

//class InsufficientFundsException extends Exception{
//    public InsufficientFundsException(){
//        super("What do you want? you don't have money");
//    }
//}

class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(double amount){
        super("What do you want? you don't have money");

        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }
}

public class part8{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);

        try{
            bankAccount.withdraw(11);
        }catch (InsufficientFundsException e){
            System.out.println(e.getAmount());
            System.out.println(e);
        }

    }
}
