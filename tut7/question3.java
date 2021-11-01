import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        double currentSalary;
        double rating = 0;
        double raise = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the current salary: "); // asks user to enter salary
        currentSalary = scan.nextDouble();
        while (currentSalary <= 0) {
            System.out.println("Enter the current salary greater than 0: "); // error checks salary input
            currentSalary = scan.nextDouble();
        }
        System.out.println("Enter the performance rating: Please enter either 1, 2 or 3");
        rating = scan.nextDouble();

        if (rating == 1) {
            raise = currentSalary * 0.06; // calculates raise
        } else if (rating == 2) {
            raise = currentSalary * 0.04;
        } else if (rating == 3) {
            raise = currentSalary * 0.015;
        }

        System.out.println("Amount of your raise: $" + raise); // output result
        System.out.println("Your new Salary: $" + (currentSalary + raise));
    }

}
