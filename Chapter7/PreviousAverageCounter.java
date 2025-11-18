import java.util.*;

public class PreviousAverageCounter {

    public static int countGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        int sum = responseTimes[0];
        int num = 1;

        for (int i = 1; i < responseTimes.length; i++) {
            double avg = (double) sum / num;

            if (responseTimes[i] > avg) {
                count++;
            }

            sum += responseTimes[i];
            num++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter response times: ");
        String line = sc.nextLine();               
        String[] parts = line.split(" ");          

        int[] responseTimes = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            responseTimes[i] = Integer.parseInt(parts[i]);
        }

        int result = countGreaterThanPreviousAverage(responseTimes);

        System.out.println("Output: " + result);
    }
}