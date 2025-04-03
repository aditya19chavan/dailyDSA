package RajaSoftware;
/*program to print occurance of string such that 
 e.g.if input is aabbbcc    output should be a2b3c2 */
public class aabbbcc {
    public static void main(String[] args) {
    String input = "aaabbbcc";
    compressString(input);
}



public static void  compressString(String str){
    int count = 1;
    for(int i = 1;i<str.length();i++){
        if(str.charAt(i) == str.charAt(i - 1)){
count++;
        } else {
            System.out.print(str.charAt(i-1) + ""+ count);
            count = 1;
        }
    }
    System.out.print(str.charAt(str.length() -1) +"" + count);
}
}