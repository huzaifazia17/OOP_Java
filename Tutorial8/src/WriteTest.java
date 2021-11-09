import java.util.Scanner;


public class WriteTest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of questions: "); //Prompts user form number of questions
        int numOfQuestions = scan.nextInt();

        while(numOfQuestions < 0){
            System.out.println("Enter the number of questions (Greater than Zero): "); // Error checking
            numOfQuestions = scan.nextInt();
        }

        TestQuestion[] arrayOfQuestions = new TestQuestion[numOfQuestions]; // create an array of test question objects

        for (int i = 0; i < numOfQuestions; i++) {

            System.out.println("Enter the type of question, e for essay and m for multiple choice: "); // Ask user for mc or for an essay question
            char type = scan.next().charAt(0);
            type = Character.toLowerCase(type);

            while(type != 'e' && type != 'm'){
                System.out.println("Enter the type of question, e for essay and m for multiple choice: Enter either m or e ");
                type = scan.next().charAt(0);
                type = Character.toLowerCase(type); // Error Checking for type char
            }

            if (type == 'e') {
                arrayOfQuestions[i] = new Essay(); // if char == e then create essay object else if ==m create a multi choice object
                arrayOfQuestions[i].readQuestion();
            }
            else if (type == 'm') {
                arrayOfQuestions[i] = new MultiChoice();
                arrayOfQuestions[i].readQuestion();
            }
        }

        System.out.println("The Questions are: ");

        for (int i = 0; i < numOfQuestions; i++) { // Print out all the Questions

            System.out.println((i +1) + " : " + arrayOfQuestions[i]);

        }
    }
}