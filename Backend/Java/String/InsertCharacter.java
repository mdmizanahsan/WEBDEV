package Backend.Java.String;

public class InsertCharacter {
    
    public static void main(String [] arga) {
        String str = "Apple";
        char ch1 = 'x';
        int pos = 2;
        String result = "";

        for(int i =0; i < str.length() ; i++){
            char ch = str.charAt(i);
              if (i == pos) {
                result = result + ch1;
              }
              result = result + ch;
        }
        System.out.println(result);
    }
}
