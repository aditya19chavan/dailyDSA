
/*
 * Q3. Given:
Two non-negative integers num1 and num2 represented as strings.

Goal:
Return the product of num1 and num2, also represented as a string.

Note:
You must not use any built-in BigInteger library or convert the inputs to integers directly.

Example 1:
Input: num1 = "2", num2 = "3"

Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"

Output: "56088"
 * 
 */


package RajaSoftware;

public class imp3 {
    
    public static String multiply(String num1, String num2) {
        final int m = num1.length();
        final int n = num2.length();

        StringBuilder sb = new StringBuilder();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                final int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                final int sum = multiply + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }

        for (final int p : pos) {
            if (p > 0 || sb.length() > 0) {
                sb.append(p);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String result = multiply(num1, num2);
        System.out.println("Product: " + result);  // Output: 56088
    }
}




/* using converting directly 
 * public class DirectMultiply {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        // Convert strings to integers
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        // Multiply and convert result back to string
        int product = n1 * n2;
        String result = Integer.toString(product);

        System.out.println("Product: " + result);  // Output: 56088
    }
}

 */