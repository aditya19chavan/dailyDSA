package RajaSoftware;
public class NearestPrime {
    public static void main(String[] args) {
        int num = 38; // Change this to test with other numbers
        System.out.println("Nearest prime: " + findNearestPrime(num));
    }

    public static int findNearestPrime(int num) {
        if (num < 2) return 2; // The smallest prime number is 2
        
        int lower = num, upper = num;
        
        while (true) {
            if (isPrime(lower)) return lower;
            if (isPrime(upper)) return upper;
            lower--;
            upper++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

