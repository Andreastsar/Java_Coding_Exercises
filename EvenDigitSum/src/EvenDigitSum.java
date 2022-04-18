public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int stored = number;
        int lastDigit = 0;

        while (stored > 0) {
            lastDigit = stored % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            stored /= 10;
        }

        return sum;

    }
}