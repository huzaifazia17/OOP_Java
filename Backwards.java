// Huzaifa Zia- 100779087
// Question 4- Tutorial 4- Bonus

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {

        String msg, reverse;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to print backwards: ");
        msg = scan.nextLine();
        reverse = printBackwards(msg);

        System.out.println("The String backwards is " + reverse);

    }

    public static String printBackwards(String s) {
        if (s.isEmpty()) {
            return s;
        }

        return printBackwards(s.substring(1) + s.charAt(0));
    }
}
