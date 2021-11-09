import java.util.Scanner;

public class Essay extends TestQuestion{

    private int numOfEmptyLines;

    @Override
    void readQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Empty Lines: "); // Ask user to print empty number of lines
        numOfEmptyLines = scan.nextInt();

        while(numOfEmptyLines < 0){
            System.out.println("Enter the number of Empty Lines (Greater than Zero): "); // Error Checking
            numOfEmptyLines = scan.nextInt();
        }

        System.out.println("Enter the Question:"); // Ask user to enter question
        scan.nextLine(); // What does this do?


        testQuestion = scan.nextLine(); // uses variable testQuestion from TestQuestion.java/ Super Class to store question
    }

    public String toString(){ // Print out the Question
        String str = testQuestion;
        for(int i = 0; i < numOfEmptyLines; i++){
            str += "\n";
        }
        return str;
    }

}
