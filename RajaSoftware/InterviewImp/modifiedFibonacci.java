   package RajaSoftware.InterviewImp;
import java.util.*;



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;
        boolean found = false;
        int evenSum = 0;

        while (num1 <= n) {
            if (num1 == n) {
                found = true;
            }
            if (num1 % 2 == 0) {
                evenSum += num1;
            }
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if (found) {
            System.out.println(n);
        } else {
            System.out.println(evenSum);
        }
    }
}

