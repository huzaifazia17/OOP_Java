import java.text.DecimalFormat;

public class average {
    DecimalFormat fmt = new DecimalFormat("0.##"); // Only output 2 decimal places

    // Method to calculate average of two numbers
    public void calcAverage(int num1, int num2) {
        float average = (float) (num1 + num2) / 2;// average is found by adding all numbers by dividing how many numbers
                                                  // there are

        System.out.println("The average of your two numbers is: " + fmt.format(average));
    }

    // Method overloading to find average of three numbers
    public void calcAverage(int num1, int num2, int num3) {
        float average = (float) (num1 + num2 + num3) / 3;

        System.out.println("The average of your three numbers is: " + fmt.format(average));

    }

    // Method overloading to find average of four numbers
    public void calcAverage(int num1, int num2, int num3, int num4) {
        float average = (float) (num1 + num2 + num3 + num4) / 4;

        System.out.println("The average of your four numbers is: " + fmt.format(average));

    }
}
