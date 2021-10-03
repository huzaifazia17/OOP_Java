import java.util.Scanner;

/*	// Question 1
        // a -> if(x>y>z){}
        // b -> if((x&&y) < 0){}
        // c -> if((x&&y) > 0){}
        // d -> if((x == y) != z){} */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What is your GPA");
        Scanner input = new Scanner(System.in);
        double gpa = input.nextDouble();

        if (gpa >= 3.5) {
            System.out.println("Congrats-- You made it to the Dean's List");
        } else {
            System.out.println("Sorry, you did not make it to the Dean's List");
        }
    }
}
