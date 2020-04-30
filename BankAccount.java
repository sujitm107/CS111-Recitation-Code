/**
 * 1. You first must create a class that represents an individual bank account.
 *      What data should your class store?
 *      What operations should you class offer? Think about what people do with bank accounts.
 * 2. Now, implement the class in Java with the behavior you outlined above.
 *      Define fields for each of the pieces of data you decided to store.
 *      Define and implement methods for each of the operations you decided to have your class
 *      offer.
 * 3. Think of sequences of operations that would be good to try to test your methods. Justify your
 *    choices.
 *      Can you think of a sequence of operations that may cause problems with a bank
 *      account? In essense, how can we break a bank account?
 * 4. In another file, create a simple test drive class that creates an instance of your bank account
 *    class, executes the sequences you came up with in part 3, and display the results
 */
//import java.utll.*;

public class BankAccount{
    //Fields
    private double balance;
    private String owner;
    private int bankAccountNumber;

    //double[] transactions = new double[100];

    //Constructor
    public BankAccount(double intialBalance, String owner, int bankAccountNumber){
        this.balance = intialBalance;
        this.owner = owner;
        this.bankAccountNumber = bankAccountNumber;
    }

    //instance methods

    //withdraw -- setter methods
    public void withdraw(double amount){
        if(amount < balance){
            balance-=amount;
        }
    }

    //deposit -- setter methods
    public void deposit(double amount){
        balance+=amount;
    }

    //check -- getter methods
    public double check(){
        return balance;
    }

    public String toString(){
        return "Bank Account Number: "+bankAccountNumber+" has "+balance+" dollars";
    }

}