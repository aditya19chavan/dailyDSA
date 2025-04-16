package RajaSoftware.InterviewImp;

public class numbertoDigitsplit {
    public static void main(String[] args) {
        int num = 2324;
        int place = 1;


        int temp = num;
        while(temp>=10){
            temp = temp/10;
            place *=10;
        }

        while(place>0){
            int digit = num/place;
            System.out.print((digit*place) + " ");
            num=num%place;
            place/=10;
        }
    }
}


/*
 * Line-by-line Explanation:
int num = 2324;
We declare and initialize an integer num with the value we want to break down.

int place = 1;
We will use this to store the current place value (1, 10, 100, etc.).

It will eventually hold the highest place value (like 1000 for 4-digit numbers).

🧮 First Loop: To calculate the highest place value
int temp = num;
We use a temporary variable temp to calculate how many digits are in the number, without changing the original num.

while (temp >= 10) {
This loop will run until temp is reduced to a single digit.

temp /= 10;
Divides temp by 10 in each iteration (essentially removes one digit from the right).

Ex: 2324 → 232 → 23 → 2

place *= 10;
Multiplies place by 10 in each step to track the digit position:

1 → 10 → 100 → 1000

🔚 After this loop:

place = 1000, because 2324 is a 4-digit number.

📤 Second Loop: Extract and print each place value
while (place > 0) {
This loop processes each digit from left to right.

int digit = num / place;
Gets the digit at the current place:

For 2324, when place = 1000, digit = 2324 / 1000 = 2

System.out.print((digit * place) + " ");
Multiplies the digit by its place value to get the actual value and prints it:

2 * 1000 = 2000 (prints 2000)

Then place = 100, prints 300, and so on...

num = num % place;
Removes the digit just processed:

2324 % 1000 = 324

324 % 100 = 24

24 % 10 = 4

place /= 10;
Move to the next lower digit place:

1000 → 100 → 10 → 1
 * 
 */