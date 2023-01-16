import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        double avg = 0;

        try {
            do {
                i++;
                int number = Integer.parseInt(scanner.nextLine());

                sum += number;

            } while (true);
        } catch (NumberFormatException err) {
            i--;
            if (i <= 0) {
                System.out.println("SUM = " + (long) sum + " AVG = " + (long)avg);
            } else {
               long result = Math.round((double)(sum / i));
                long convertedSum = (long) sum;
                System.out.println("SUM = " + convertedSum + " AVG = " + result);
            }
        }
    }
}
