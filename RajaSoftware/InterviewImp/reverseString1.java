package RajaSoftware.InterviewImp;

public class reverseString1 {
    public static void main(String[] args) {
        String str = "Raja Software";
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result +=str.charAt(i);
        }
        System.out.println(result);
    }
}
