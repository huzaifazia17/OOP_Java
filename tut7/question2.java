import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your GPA"); // prompts user to enter gpa
        double gpa = scan.nextDouble();

        while (gpa < 0 || gpa > 4.0) {
            System.out.println("Enter your GPA, between 0 and 4.0"); // error checks for input values
            gpa = scan.nextDouble();
        }

        if (gpa > 3.5) {
            System.out.println("Congratulations: You have made the Deans List "); // prints out results
        } else {
            System.out.println("Sorry, you did not make the Deans List ");
        }

    }
}
