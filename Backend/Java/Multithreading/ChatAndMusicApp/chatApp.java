package Backend.Java.Multithreading.ChatAndMusicApp;

public class chatApp extends Thread{
    
    public void run() {
        for(int i =1 ; i <= 5; i++){
            System.out.println("Chating with friend.....");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
