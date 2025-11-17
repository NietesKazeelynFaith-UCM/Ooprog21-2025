
// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // use nextDouble for decimal values

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // fixed typo

        calcTip(check1);
        calcTip(check2);

        input.close(); // always good to close Scanner when done
    }

    public static void calcTip(double bill) {
        final double RATE = 0.15; // fixed typo in 'double'
        double tip;
        tip = bill * RATE; // fixed logic
        System.out.println("The tip should be at least $" + tip);
    }
}
