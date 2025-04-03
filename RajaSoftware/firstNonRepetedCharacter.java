package RajaSoftware;
//first non repating character in string
public class firstNonRepetedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str) {
        int[] freq = new int[256];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }


        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return  0;
    }
}
