public class NumberPalindrome{

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int comparedNumber = number;

        while (comparedNumber > 0) {
            int lastDigit = comparedNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            comparedNumber /= 10;
        }

        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}
