
// Huzaifa Zia- 100779087
// Question 1- Tutorial 4
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base, exp;
        int answer;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the power program");
        System.out.println("Please use integers only");

        // get base
        System.out.print("Enter the base you would like raised to a power: ");
        base = scan.nextInt();

        // get exponent
        System.out.print("Enter the power you would like raised to: ");
        exp = scan.nextInt();

        answer = power(base, exp);
        System.out.println(base + " raised to the " + exp + " is " + answer);
    }

    // compute power and return answer
    // recursive methos that will compute the power
    public static int power(int base, int exp) {
        int pow;
        if (exp == 0) {
            pow = 1;
            return pow;
        } else {
            return pow = base * power(base, exp - 1);
        }

    }
}
