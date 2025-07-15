package Backend.Java.Multithreading.DeadlockExample;

public class EmailSender implements Runnable{
    
    private String Email ;

    public EmailSender(String Email){
        this.Email = Email;

    }

        public void run() {

          System.out.println("Email is sending "+Email);
          try{
            Thread.sleep(2000);
          } catch(Exception e){

          }

          System.out.println("Email is send "+Email);
    }
}
