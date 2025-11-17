import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double rate = 0.03; // 3% interest rate
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();

        do {
            balance = balance + (balance * rate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                              year, rate, balance);
            year++;

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >> ");
            choice = input.nextInt();
        } while (choice == 1);

        System.out.println();
        System.out.println("----jGRASP: Operation complete.");
    }
}