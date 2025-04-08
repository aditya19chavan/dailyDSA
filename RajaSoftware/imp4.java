
/*
 * Q4. Given:
A string str containing only three types of characters: '(', ')' and '*'.

Goal:
Return true/false based on whether the string str is valid or not.

The following rules define a valid string:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.

Any right parenthesis ')' must have a corresponding left parenthesis '('.

Left parenthesis '(' must go before the corresponding right parenthesis ')'.

'*' could be treated as:

A single right parenthesis ')', or

A single left parenthesis '(', or

An empty string "".

Examples:
Example 1:

Input: str = "()"

Output: true

Example 2:

Input: str = "(*)"

Output: true

Example 3:

Input: str = "(*))"

Output: true

Example 4:

Input: str = "(*))("

Output: false
 */



package RajaSoftware;

public class imp4 {
    public static boolean isValidString(String str) {
        int low = 0; // Minimum possible '(' count
        int high = 0; // Maximum possible '(' count

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                // Increment both low and high for '('
                low++;
                high++;
            } else if (c == ')') {
                // Decrement both low and high for ')'
                if (low > 0) {
                    low--; // Only decrement low if it's greater than 0
                }
                high--; // Always decrement high
            } else if (c == '*') {
                // '*' can be '(', ')' or nothing
                if (low > 0) {
                    low--; // Reduce minimum '(' count if possible
                }
                high++; // Increment maximum '(' count
            }

            // If high becomes negative, there are unmatched ')' characters
            if (high < 0) {
                return false;
            }
        }

        // At the end, low must be 0 for the string to be valid
        return low == 0;
    }

    public static void main(String[] args) {
        // Example inputs
        System.out.println(isValidString("()"));      // Output: true
        System.out.println(isValidString("(*)"));     // Output: true
        System.out.println(isValidString("(*))"));    // Output: true
        System.out.println(isValidString("(*))("));   // Output: false
    }
}
