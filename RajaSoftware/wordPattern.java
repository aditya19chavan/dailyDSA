package RajaSoftware;

import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        String pattern =  "abba";
        String s ="dog, cat, cat, fish";
        System.out.println(wordpattern(pattern, s));
    }

    public static boolean wordpattern(String pattern, String s)
    {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length)
        {
            return false;
        }
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch =pattern.charAt(i);
            boolean containsKey=hm.containsKey(ch);
            if(hm.containsValue(arr[i]) && !containsKey)
            {
                return false;
            }
            if(containsKey && hm.get(ch).equals(arr[i]))
            {
                
                return false;
            }else{
                hm.put(ch,arr[i]);
            }
          
        }
        return true;
    }
}
