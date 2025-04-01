package String;
import java.util.Scanner;
public class removeelementExceptaplha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String  result  = str.replaceAll("[^a-zA-Z]", "");   //using regx


        System.out.println("After removing: " +result);
    }
}



// class Main {
//     public static void main(String[] args) {
//         String str = "Hello 123!@# World";
//         StringBuilder result = new StringBuilder();
        
//         for (char c : str.toCharArray()) {
//             if (Character.isLetter(c)) { // Check if the character is a letter
//                 result.append(c);
//             }
//         }
        
//         System.out.println("String after removing non-alphabetic characters: " + result);
//     }
// }
