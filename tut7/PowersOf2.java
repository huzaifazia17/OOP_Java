import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {
        int numPowersOf2;
        int nextPowerOf2 = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers of 2 would you like to be printed? ");
        numPowersOf2 = scan.nextInt(); // user input of how many powers they want to calculate

        System.out.println(numPowersOf2 + " powers of 2 will be printed from 2^0 to 2^" + (numPowersOf2 - 1));

        for (int i = 0; i <= numPowersOf2 - 1; i++) { // for loop to calculate power without using .pow method
            System.out.print("2^" + i + " = ");
            System.out.println(nextPowerOf2);
            nextPowerOf2 = nextPowerOf2 * 2;

        }
    }
}
