package RajaSoftware;



//Write a function that takes an input as a String . 
//The function should replace the alternatewords in it with "abc".
// Words are seperated by dots.(Avoid using inbuilt function) input is 
//   "i.like.this.program.very.much"    output will  be "i.abc.this.abc..very.abc"   
 


public class que2 {
    public static String repFunc() {
        String a = "i.like.this.program.very.much";
        String word = "";
        String finalStr = "";
        int wordCount = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '.') {
                word += a.charAt(i);
            } else {
                if (wordCount % 2 == 0) {
                    finalStr += word + ".";
                } else {
                    finalStr += "abc.";
                }
                word = ""; // Reset word
                wordCount++;
            }
        }

        // Append the last word if present
        if (!word.isEmpty()) {
            if (wordCount % 2 == 0) {
                finalStr += word;
            } else {
                finalStr += "abc";
            }
        }

        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(repFunc()); // Expected Output: "i.abc.this.abc.very.abc"
    }
}
