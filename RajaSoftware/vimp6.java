package RajaSoftware;
//isomorphic string 

public class vimp6 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[]arr_s = new int [128];
        int[]arr_t = new int [128];

        for(int i=0;i<s.length();i++){
            char m = s.charAt(i);
            char n = t.charAt(i);

            if(arr_s[m] == 0) arr_s[m] = n;
            if(arr_t[n] == 0) arr_t[n] = m;

            if(arr_s[m] != n || arr_t[n] != m)
            return false;
        }
        return true;
}
}
