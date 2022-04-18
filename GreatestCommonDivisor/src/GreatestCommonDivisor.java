public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int maxNum = first;
        if (second > maxNum) {
            maxNum = second;
        }
        int maxDivisor = 0;
        for (int i=1; i <= maxNum; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                maxDivisor = i;
            }
        }
        return maxDivisor;
    }
}