package RajaSoftware.InterviewImp;

public class CountOccuranceInString {
    public static void main(String[] args) {
        String str = "aditya";
        int[] charCount = new int[256];  // Assuming ASCII

        // Fix 1: Use str.toCharArray()
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Character occurrences: ");

        // Fix 2: Loop should go till 255 (index 0–255)
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                // Fix 3: Correct syntax to print char
                System.out.println((char)i + ": " + charCount[i]);
            }
        }
    }
}
