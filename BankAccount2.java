
public class BankAccount2{
    //Fields
    private String name;
    private double checkingBalance;
    private double savingsBalance;
    private int pin;
    //ArrayList<Double> transactions = new ArrayList<Double>();

    //Constructor
    public BankAccount2(String name, double icheckingAmount, double isavingsAmount, int pin){
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