package String;
import java.util.HashSet;
import java.util.Scanner;



public class returnDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String str2 = sc.nextLine();

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> commonChars = new HashSet<>();


for(char c: str1.toCharArray()){
set1.add(c);
}

for(char c: str2.toCharArray()){
    if(set1.contains(c)){
        commonChars.add(c);
    }
}
System.out.println("common characters: " +commonChars);
    }
}
