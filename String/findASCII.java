package String;
import java.util.Scanner;

public class findASCII {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a character: ");
    char ch = sc.next().charAt(0);
    

    //Get ASCII value
    int asciiValue = (int) ch;


    System.out.println("ASCII value of " + ch + " is: " +asciiValue);

}
}
