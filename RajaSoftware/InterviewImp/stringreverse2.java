package RajaSoftware.InterviewImp;
//leetcode :  reverse words in string |||
public class stringreverse2 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String[] words = s.split(" " );
        StringBuilder result = new StringBuilder();


        for(String word:words){
            //manually reverse each word

            for(int i=word.length() - 1;i>=0;i--){
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
