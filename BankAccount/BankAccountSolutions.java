package BankAccount;

public class BankAccountSolutions {
//fields
    private double savings;
    private double checking;
    
//constructor
    public BankAccountSolutions(double initialSaving, double initialChecking){
        this.savings = initialSaving;
        this.checking = initialChecking;
    }
//instance methods
    public double checkSavings(){
        return savings;
    }

    public double checkChecking(){
        return checking;
    }

    public void depositChecking(double amount){
        checking+=amount;
    }

    public void depositSavings(double amount){
        savings+=amount;
    }

    public void withdrawChecking(double amount){
        checking-=amount;
    }

    public void withdrawSavings(double amount){
        savings-=amount;
    }

    public String toString(){
        return "checking: "+checking+", "+"savings: "+savings;
    }
}