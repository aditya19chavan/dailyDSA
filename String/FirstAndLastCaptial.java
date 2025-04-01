package String;

import java.util.Scanner;

public class FirstAndLastCaptial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Process and print result
        System.out.println("Modified string: " + capitalizeFirstLast(str));
    }

    public static String capitalizeFirstLast(String str){
String[] words = str.split(" ");
for(int i=0;i<words.length;i++){
    if(words[i].length() > 1){
        words[i] = words[i].substring(0,1).toUpperCase() + 
        words[i].substring(1,words[i].length() - 1) +
        words[i].substring(words[i].length() - 1).toUpperCase();
    }else{
        words[i] = words[i].toUpperCase();
    }
}
return String.join(" ", words);
    }
}
