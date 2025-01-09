import java.util.Scanner;

public class MinutesToYearAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long[] result = convertMinutesToYearsAndDays(minutes);
        long years = result[0];
        long days = result[1];

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }

    public static long[] convertMinutesToYearsAndDays(long minutes) {
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (60 * 24);

        return new long[]{years, days};
    }
}