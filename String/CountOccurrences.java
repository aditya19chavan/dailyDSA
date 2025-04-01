package String;
import java.util.HashMap;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Array to store frequency of characters (assuming lowercase English letters)
        int[] charCount = new int[256]; // ASCII size


    for(char c: str.toCharArray()){
        charCount[c]++;
    }



    System.out.println("Character occurrences: ");

    for(int i=0;i<256;i++){
if(charCount[i] > 0){
    System.out.println((char)i +":"+charCount[i]);
}
    }
    }
}
