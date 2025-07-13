package Backend.Java.Multithreading.ChatAndMusicApp;

public class musicApp extends Thread{

   public void run(){
    for(int i = 1; i <= 5; i++){
        System.out.println("I am listening music also.....");
        try{
            Thread.sleep(1500);
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
   }
    
}
