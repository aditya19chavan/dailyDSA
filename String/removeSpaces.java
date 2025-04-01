package String;

import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();


        String result = str.replaceAll("\\s", "");
        System.out.println(result);
    }
    
}
