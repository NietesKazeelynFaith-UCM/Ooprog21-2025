import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String inputName = sc.nextLine();

        String predefined = "Carmen";

        if (predefined.equals(inputName)) {
            System.out.println("Carmen equals " + inputName);
        } else {
            System.out.println("Carmen does not equal " + inputName);
        }

        sc.close();
    }
}