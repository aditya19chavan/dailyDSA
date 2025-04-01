
package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

class removeelementExceptaplha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Using LinkedHashSet to maintain order while removing duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (set.add(c)) { // Only add unique characters
                result.append(c);
            }
        }

        // Print the result
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }
}
