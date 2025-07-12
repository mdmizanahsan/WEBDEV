package Backend.Java.Oops.Encapsulation.Bank;

public class Bank {
    
    private String AccountNumber ;
    private String accountHolderName ;
    private Double balance ;

    public Bank(String AccountNumber, String accountHolderName, Double balance ) {
        this.AccountNumber = AccountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


}
