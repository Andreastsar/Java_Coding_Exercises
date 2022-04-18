public class SharedDigit {

    public static boolean hasSharedDigit(int numx, int numy) {

        if (numx < 10 || numx > 99 || numy < 10 || numy > 99) {
            return false;
        }

        return (numx % 10 == numy % 10) || (numx % 10 == numy / 10) || (numx / 10 == numy % 10) || (numx / 10 == numy / 10);
    }
}
