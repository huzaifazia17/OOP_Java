import java.util.Scanner;


public class MultiChoice extends TestQuestion{

    String[] choices; // instance variable

    @Override
    void readQuestion() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of choices: "); //prompt user to input num of choices
        int numOfChoices = scan.nextInt();

        while(numOfChoices <0){
            System.out.println("Enter the number of choices (Greater than Zero): "); //Error Checking
            numOfChoices = scan.nextInt();
        }

        System.out.println("Enter the Question:"); // Ask user to enter the question
        scan.nextLine();

        testQuestion = scan.nextLine(); // uses variable testQuestion from TestQuestion.java/ Super Class to store question

        choices = new String[numOfChoices];

        for(int i = 0; i < numOfChoices; i++){ // Ask user to enter multiple choice questions choices
            System.out.print("Now Enter choice number " + (i + 1) + ": ");
            choices[i] = scan.nextLine();
        }
    }

    public String toString(){ // To string method to print questions
        String str = testQuestion + "\n";
        char displayCharacter = 'a';

        for(int i = 0; i < choices.length; i++){ //Print With formatting and labeling

            str += ("\t" + Character.toString((char) (displayCharacter + i)) + ") " + choices[i] + "\n");
        }
        return str;
    }

}