public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid Value");
        }
        long years = minutes / 525600L;
        long days = (minutes % 525600L) / 1440L;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
