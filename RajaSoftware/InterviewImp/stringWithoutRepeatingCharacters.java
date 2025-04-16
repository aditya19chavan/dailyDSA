package RajaSoftware.InterviewImp;

public class stringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "helper";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(!seen[ch]){
                result.append(ch);  // Add to result only if not seen
                seen[ch] =true;     /// Mark character as seen

            }
        }
        System.out.println("output:" +result);
    }
}


/*
 * If seen[ch] == false, this is the first time we're seeing the character.

Add it to the result, and mark it as seen by setting seen[ch] = true.

If it has been seen before, we skip it.
 */