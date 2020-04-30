
public class Main {
    
    public static void main(String[] args){


        BankAccount mybank = new BankAccount(100, "Sujit", 1234);

        mybank.deposit(200);

        System.out.println(mybank.check());

        System.out.println(111);
        System.out.println(mybank);

    }
}