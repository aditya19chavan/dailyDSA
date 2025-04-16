public class demo1 {


    /*Que.: Closest Prime number

Details:
Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.

Test cases:
"32": Closest prime number is "31", so print "31"
"30": Closest prime numbers are "29" and “31”, so print both */
    public static void main(String[] args) {
       int number = 10;
       
       

if(isPrime(number)){
    System.out.println(number);
    return;
}

       int lowerPrime = number - 1,upperPrime=number + 1;
 while(!isPrime(lowerPrime)){
    lowerPrime--;

 }

 while(!isPrime(upperPrime)){
upperPrime++;
 }




 int closestPrime = (number - lowerPrime <=upperPrime-number)? lowerPrime:upperPrime;
System.out.println(closestPrime);
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0) return false;
}
return true;
    }
}
