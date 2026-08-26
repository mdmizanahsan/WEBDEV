package Backend.Java.String;

public class SearchCharacter {
    public static void main(String [] args){
        String str = "apple";
        char ch = 'l';

        for(int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);

            if (ch1 == ch) {
                System.out.println(i);
                break;                
            }
        }
    }
}
