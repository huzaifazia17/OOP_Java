// Huzaifa Zia- Assignment 2
// Question 2- Version 1

import java.util.Scanner;

public class MyMain_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.next();

        System.out.println("Your string formatted is: ");

        // Create string Manipulation object
        StringManipulation msg = new StringManipulation(str);

        // Print manipulated string
        System.out.println(msg.manipulate(str));
    }
}
