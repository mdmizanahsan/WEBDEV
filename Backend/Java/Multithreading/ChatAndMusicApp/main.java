package Backend.Java.Multithreading.ChatAndMusicApp;

public class main {
    
    public static void main(String[] args) {
        
        chatApp chat = new chatApp();

        chat.start();

        musicApp music = new musicApp();

        music.start();
    }
}
