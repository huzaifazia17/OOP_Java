// Huzaifa Zia- 100779087
// Question 2- Tutorial 4

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to check for a palindrome");
        String message = scan.nextLine();

        boolean check = isPalindrome(message.toLowerCase());

        if (check == true) {
            System.out.println(message + " is a palindrome");
        } else {
            System.out.println(message + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int test = s.length();
        // if len is zero then return true else check for palindrome
        if (test == 0)
            return true;
        return palindromeTest(s, 0, test - 1);
    }

    // recursive method to check if message is palindorme
    public static boolean palindromeTest(String s, int test1, int test2) {
        if (test1 == test2) // if recursive call continues to run and first and last int equal, return true
            return true;
        if ((s.charAt(test1) != (s.charAt(test2)))) // if first and last character not equal, return false
            return false;
        if (test1 < test2 + 1)
            // run a recursive call to check if characters are equal to each other
            return palindromeTest(s, test1 + 1, test2 - 1);
        return true;
    }

}