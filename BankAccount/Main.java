package BankAccount;

public class Main {
    public static void main(String[] args){
        
        BankAccount sally = new BankAccount("Sally", 0, 100, 1234);

        sally.depositChecking(100);
        System.out.println(sally.getcheckingBalanceAmount());

    }
}