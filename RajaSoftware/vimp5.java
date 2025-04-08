package RajaSoftware;
import java.util.*
;
public class vimp5 {
    public static void main(String[] args) {
        String str1 = "{()}";
System.out.println(validParenthesis(str1));

    }
    public static boolean validParenthesis(String str){

    
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
             if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
             }else{
                if(st.size() == 0) {
                    return false;
                }
                
                if((st.peek() == '(' && ch == ')') ||
                (st.peek() == '{' && ch == '}') ||
                (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
                
             }
        }
        return st.isEmpty();
    }
}
