import java.util.Scanner;

public class PowersOF2 {
    public static void main(String[] args) {
        int numPowersOf2;
        int nextPowerOf2 = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers of 2 would you like to be printed? ");
        numPowersOf2 = scan.nextInt();

        System.out.println(numPowersOf2 + " powers of 2 will be printed");

        for (int i = 0; i <= numPowersOf2; i++) {
            System.out.println(nextPowerOf2);
            nextPowerOf2 = nextPowerOf2 * 2;

        }
    }
}
