import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
        scanner.close();
    }
}