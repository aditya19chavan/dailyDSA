package String;
import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("String after removing vowels: " +result);
    }
}
