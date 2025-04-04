package RajaSoftware;
public class CyclicStringCheck {
    public static boolean isCyclicRotation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        String combined = str1 + str1;
        return combined.contains(str2);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";

        System.out.println(isCyclicRotation(s1, s2)); // Output: true
    }
}
