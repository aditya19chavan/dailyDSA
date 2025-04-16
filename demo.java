public class demo {


    /*Remove the minimum number of characters from the string to make it palindrome and return the count of deleted characters.
The function will take a single argument which will be a string.
Test cases:

Input: “aebcbda”
Output: 2

Input: “01210”
Output: 0
Int getRemoveCharacterCount(String str) {
// TODO
// Write code here
} */
    public static void main(String[] args) {
        String str="aebcbda";
        int n= str.length();
        int[][] s= new int[n][n];

        for(int i=0;i<n;i++){

        }
        for(int len=1;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if(str.charAt(i) ==str.charAt(j)){
                    s[i][j]=s[i+1][j-1];

                  
                }else{
                    s[i][j]=1+Math.min(s[i+1][j])
                }
            }
        }

    }
}
