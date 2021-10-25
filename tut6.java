import java.util.Scanner;
import java.text.DecimalFormat;

public class tut6 {
    public static void main(String[] args) {

        // Initilize variables
        int numOfQuestions;
        int correct = 0, answer;
        float percentCorrect = 0;

        Scanner scan = new Scanner(System.in); // open scanner to read line

        System.out.println("How many Questions are there in the quiz? ");
        numOfQuestions = scan.nextInt();
        while (numOfQuestions < 0) { // Error checking for input less than 0
            System.out.println("How many Questions are there in the quiz? *Enter a number greater than 0 ");
            numOfQuestions = scan.nextInt();
        }
        int[] key = new int[numOfQuestions]; // initialize array

        for (int i = 1; i <= numOfQuestions; i++) {
            System.out.println("Enter the correct answer key for question " + i); // input answer key into array
            key[i - 1] = scan.nextInt();
        }
        for (int i = 1; i <= numOfQuestions; i++) {
            System.out.println("Enter the answer for the quiz to be graded for question " + i);
            answer = scan.nextInt();
            if (answer == key[i - 1]) { // Compare answers with key and check how many are correct
                correct++;
            }
        }
        DecimalFormat fmt = new DecimalFormat("0.##"); // Set decimal to max 2 digits
        percentCorrect = (((float) correct / (float) numOfQuestions) * 100); // caluclate percent correct

        System.out
                .println("You grade is: " + correct + "/" + numOfQuestions + " or " + fmt.format(percentCorrect) + "%"); // result
        // output
    }
}