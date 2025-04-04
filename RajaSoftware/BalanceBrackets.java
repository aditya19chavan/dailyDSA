package RajaSoftware;
import java.util.*;
public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = scanner.nextLine();

        int  openCount = 0, closeCount = 0;
        for(char ch:input.toCharArray()){
            if(ch == '{') openCount++;
            else if(ch == '}') closeCount++;
        }

        int pairs = (openCount < closeCount) ? openCount : closeCount;

        for(int i=0;i<pairs;i++){
System.out.println("{}");
        }
    }
}


/*
 * import java.util.Scanner;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = scanner.nextLine();
        scanner.close();

        int openCount = 0, closeCount = 0;
        boolean hasOpening = false, hasClosing = false;

        // Count number of opening and closing brackets
        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                openCount++;
                hasOpening = true;
            } else if (ch == '}' || ch == ']' || ch == ')') {
                closeCount++;
                hasClosing = true;
            }
        }

        // If only opening brackets or only closing brackets exist, it's impossible to balance
        if (!hasOpening || !hasClosing) {
            System.out.println("Cannot be balanced");
            return;
        }

        // Find the number of possible valid pairs
        int pairs = (openCount < closeCount) ? openCount : closeCount;

        // Print balanced pairs
        for (int i = 0; i < pairs; i++) {
            System.out.print("{} ");
        }
    }
}

 * 
 * 
 * 
 */