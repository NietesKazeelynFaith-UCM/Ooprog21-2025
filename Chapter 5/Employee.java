public class Employee {
    private double payRate;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(double payRate) {
        this.payRate = payRate; // Accept any pay rate
    }

    public double computeRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double computeOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }

    public double getOvertimeHours(double hoursWorked) {
        return Math.max(hoursWorked - 40, 0);
    }
}
