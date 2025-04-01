package String;

import java.util.Scanner;

public class findNonRepatedCharacter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] charCount = new int[256];

        for(char c:str.toCharArray()){
            charCount[c]++;
        }

        System.out.println("Non-repeating characters: ");
        for(char c: str.toCharArray()){
            if(charCount[c] ==1){
                System.out.print(c + " ");
            }
        }

    }
}
