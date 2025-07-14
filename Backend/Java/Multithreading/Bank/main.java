 /*  You have a bank account with ₹1000. 
  *  Two users are trying to withdraw money at the same time from the same account.
  * 
  */


package Backend.Java.Multithreading.Bank;

public class main {
    
    public static void main(String[] args) {
        
        BankAccount Account = new BankAccount();
     
        // Creating thread by lamda style
         Thread userA = new Thread(() -> {
            Account.withdraw("userA", 500);
         });
    
         Thread userB = new Thread(() -> {
            Account.withdraw("userB", 700);
         });

         // start both thread
         userA.start();
         userB.start();
    }
}
