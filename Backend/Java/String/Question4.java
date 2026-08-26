package Backend.Java.String;

public class Question4 {
  public static void main(String[] args) {
    String str = "java23";

    for(int i = 0 ; i < str.length(); i++){
        char ch = str.charAt(i);
        if (ch >= '0' && ch <= '9') {
            System.out.println("The First Digit is " +ch);
            break;
        }
    }
  }
}
