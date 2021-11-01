import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value for x:"); // prompts user for x y and z values
        int x = scan.nextInt();
        System.out.println("Enter the value for y:");
        int y = scan.nextInt();
        System.out.println("Enter the value for z:");
        int z = scan.nextInt();

        if (x > y && x > z && z < y) {
            System.out.println("X < Y < Z"); // Test cases and prints out resluts
        }
        if (x < 0 && y < 0) {
            System.out.println("X and Y are both less than zero");
        }
        if (x > 0 && y > 0) {
            System.out.println("Niether X or Y is less than zero");
        }
        if (x == y && x != z) {
            System.out.println("X is equal to Y but not equal to Z");
        }

    }
}
