public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2){
        int v1 = (int)(no1 * 1000);
        int v2 = (int)(no2 * 1000);
        if (v1 == v2){
            return true;
        }
        return false;
    }
}
