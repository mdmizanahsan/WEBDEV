package Backend.Java.Multithreading.Bank;

public class BankAccount  {

    int balance = 1000;
   
     public void withdraw( String user, int amount){

        synchronized(this){

            if(balance >= amount){
                System.out.println(user+" trying to withdraw this amout "+amount);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }

            balance = balance - amount;

            System.out.println(user+" sucessfully withdraw this money"+amount);

            System.out.println("Your balance is "+balance);
        }
        else{
            System.out.println("sorry " + user + ", insufficient balance ." );
        }
       }
    }
}
