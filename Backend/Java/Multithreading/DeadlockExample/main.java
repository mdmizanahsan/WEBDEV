package Backend.Java.Multithreading.DeadlockExample;

public class main {
    
    public static void main(String[] args) {
        
       Thread user1 = new Thread(new EmailSender("user1@gmail.com"));
       Thread user2 = new Thread(new EmailSender("user2@gmail.com"));
       Thread user3 = new Thread(new EmailSender("user3@gmail.com"));

        user1.start();
        user2.start();
        user3.start();

    }
}
