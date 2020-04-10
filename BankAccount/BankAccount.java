package BankAccount;

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

public class BankAccount {
    //Fields
    String name;
    double checkingBalance;
    double savingsBalance;
    int pin;
    //ArrayList<Double> transactions = new ArrayList<Double>();

    //Constructor
    public BankAccount(String name, double icheckingAmount, double isavingsAmount, int pin){
        this.name = name;
        this.checkingBalance = icheckingAmount;
        this.savingsBalance = isavingsAmount;
        this.pin = pin;
    }

    //instance methods
    public double withdrawChecking(double amount){
        if(amount < checkingBalance){
            checkingBalance -= amount;
            //transactions.add(-1*amount);
        }
        return amount;
    }

    public double withdrawSavings(double amount){
        if(amount < savingsBalance){
            savingsBalance -= amount;
            //transactions.add(-1*amount);
        }
        return amount;
    }

    public void depositChecking(double amount){
        checkingBalance += amount;
        //transactions.add(amount);
    }

    public void depositSavings(double amount){
        checkingBalance += amount;
        //transactions.add(amount);
    }

    public double getcheckingBalanceAmount(){
        return checkingBalance;
    }

    public double getsavingsBalanceAmount(){
        return savingsBalance;
    }

    public void changePin(int newPin){
        pin = newPin;
    }

    public int getPin(){
        return pin;
    }

}