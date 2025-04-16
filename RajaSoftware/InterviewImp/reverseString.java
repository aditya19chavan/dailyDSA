package RajaSoftware.InterviewImp;

public class reverseString {
    public static void main(String[] args) {
        String s = "Raja Software";
String[] words = s.split(" ");

StringBuilder sb = new StringBuilder();
for(int i=words.length-1;i>=0;i--){
sb.append(words[i]);
sb.append(" ");
}
System.out.println(sb.toString().trim());
    }
}
