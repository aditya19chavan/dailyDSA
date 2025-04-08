
/*
 * Q5. Given:
A string pattern with a specific pattern of chars and another string str.

Goal:
Determine if str follows the same pattern. Specifically:

Each char in pattern maps to exactly one unique word in str.

Mapping includes: matching the sequence of chars from pattern with the sequence of words in str.

No two chars from pattern map to the same word in str, and no two words map to the same char.

Note: Pattern contains lowercase letters.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"

Output: true

Explanation: The mapping can be established as: 'a' maps to "dog" and 'b' maps to "cat". So, the pattern is followed in str.

Example 2:
Input: pattern = "abba", str = "dog cat cat fish"

Output: false

Explanation: The mapping cannot be established because: 'a' maps to "dog", but 'a' also tries mapping to "fish" which doesn't follow the pattern.

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"

Output: false

Explanation: 'a' must map to a single word. Here, 'a' is mapping to different words, so return false.

Example 4:
Input: pattern = "abcd", str = "dog cat monkey dog"

Output: false

Explanation: str should have all different words since pattern has all different chars.
 */


package RajaSoftware;

import java.util.HashMap;



public class imp5 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word))
                    return false;
            } else {
                if (wordToChar.containsKey(word))
                    return false;

                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        imp5 obj = new imp5();

        System.out.println(obj.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(obj.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(obj.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(obj.wordPattern("abcd", "dog cat monkey dog")); // false
    }
}

