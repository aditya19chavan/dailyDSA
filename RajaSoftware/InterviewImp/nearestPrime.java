package RajaSoftware.InterviewImp;

public class nearestPrime {
    public static void main(String[] args) {
        int number = 30; // Replace with the number of your choice
        if (number < 2) {
            System.out.println("Nearest prime number: 2");
            return;
        }

        int lowerPrime = number, upperPrime = number;

        while (!isPrime(lowerPrime)) {
            lowerPrime--;
        }

        while (!isPrime(upperPrime)) {
            upperPrime++;
        }

        int nearestPrime = (number - lowerPrime <= upperPrime - number) ? lowerPrime : upperPrime;

        System.out.println("Nearest prime number: " + nearestPrime);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
