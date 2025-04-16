package RajaSoftware.InterviewImp;

public class StringToIntgerConversion {
    public static void main(String[] args) {
        String str = "12345";
        int num = 0;


        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

if(c >='0' && c<='9'){
    num = num * 10 +(c-'0');
}            else{
    System.out.println("Invalid character found:" +c);
    return;
}
        }
        System.out.println("Converted number: " +num);
    }
}
