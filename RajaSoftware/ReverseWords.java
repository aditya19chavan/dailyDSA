package RajaSoftware;

//Print given string("Raja Software Labs") in this way ("Labs Software Raja"); not allowed to use tokenizer, split or any other buylt in functions.



public class ReverseWords {
    public static void main(String[] args) {
        // Given string
        String str = "Raja Software Labs";

        // Initialize an empty array to store words
        String[] words = new String[10]; // Adjust size based on expected number of words
        String word = "";
        int index = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') { // If space is encountered, save the word
                words[index++] = word;
                word = ""; // Reset word for the next one
            } else {
                word += ch;
            }
        }

        // Add the last word to the array
        words[index++] = word;

        // Print words in reverse order
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" "); // Add space between words
            }
        }
    }
}