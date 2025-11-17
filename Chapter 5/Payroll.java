import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Do NOT close

        // Get hours worked
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        // Get pay rate
        System.out.print("What is the regular pay rate? ");
        double payRate = input.nextDouble();

        // Create employee object
        Employee emp = new Employee(payRate);

        // Calculate pay
        double regularPay = emp.computeRegularPay(hoursWorked);
        double overtimePay = emp.computeOvertimePay(hoursWorked);

        // Display output
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay " + overtimePay);
    }
}
