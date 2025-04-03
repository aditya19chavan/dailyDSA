/* Write a program to print the frequency of these characters b,f,p,v in agiven string and also print the
 * total count of these characters .(ignore the character cases)
 * 
 * 
 * The function will take 1 parameters which will be a strong .
 * 
 * 
 * Example:
 * Input: rajasoftwarelabs   
 *  Output: b=1, f=1, j=1, Total =3
 * 
 * Input : Buffet 
 * Output: b=1, f=2, j =1
 */




package RajaSoftware;

public class que5 {
    public static void main(String[] args) {
     String str = "BuFfet";
     int countb = 0,countf=0,countp=0,countv =0;
     int total = 0;
     for(char ch: str.toCharArray()){
        if(ch == 'b' || ch == 'B'){
              countb++;
              total++;
        } else if( ch == 'f' || ch == 'F'){
            countf++;
            total++;
        } else if( ch == 'p' || ch == 'P'){
            countp++;
            total++;
        }  else if( ch == 'v' || ch == 'V'){
            countv++;
            total++;
        }
     }

if(countb > 0)
System.out.println("b=" + countb + ", ");
if(countf > 0)
System.out.println("f=" + countf + ",");
if (countp > 0) 
System.out.print("p=" + countp + ", ");
if (countv > 0)
 System.out.print("v=" + countv + ", ");


 System.out.println("Total="  +total);

    }
}
