
public class Main2 {
    public static void main(String[] args){
        
        BankAccount2 sally = new BankAccount2("Sally", 0, 100, 1234);

        sally.depositChecking(100);
        System.out.println(sally.getcheckingBalanceAmount());


    }
}