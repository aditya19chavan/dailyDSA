package String;
import java.util.Scanner;
public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter algebirc expression : ");
        String str = sc.nextLine();

        String result = str.replaceAll("[(){}\\[\\]]","");

        System.out.println("Expression after removing brackets: " +result);
    }
}
