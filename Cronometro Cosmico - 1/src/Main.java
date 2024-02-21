import java.util.Scanner;

public class Main {
    private static double dayLengthOnNewPlanet = 1.5; // Supongamos que un día en el nuevo planeta es 1.5 días en la Tierra

    public static double convertSeconds(double seconds) {
        double days = seconds / (24 * 60 * 60);
        return days * dayLengthOnNewPlanet;
    }

    public static double convertMinutes(double minutes) {
        double days = minutes / (24 * 60);
        return days * dayLengthOnNewPlanet;
    }

    public static double convertHours(double hours) {
        double days = hours / 24;
        return days * dayLengthOnNewPlanet;
    }

    public static double convertDays(double days) {
        return days * dayLengthOnNewPlanet;
    }

    public static double convertYears(double years) {
        double days = years * 365;
        return days * dayLengthOnNewPlanet;
    }

    public static void displayTimeInDifferentFormats(double newPlanetTime) {
        double seconds = newPlanetTime * 24 * 60 * 60;
        double minutes = seconds / 60;
        double hours = minutes / 60;
        double days = hours / 24;

        System.out.println("Time on the new planet: " + newPlanetTime + " days");
        System.out.println("Which is equivalent to: ");
        System.out.println(seconds + " seconds");
        System.out.println(minutes + " minutes");
        System.out.println(hours + " hours");
        System.out.println(days + " days");
    }

    public static void displayMaxValues() {
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
    }

    public static void convertUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time on Earth in seconds, minutes, hours or days:");
        double earthTime = scanner.nextDouble();

        System.out.println("Enter the unit of time (seconds, minutes, hours, days):");
        String unit = scanner.next();

        double newPlanetTime;
        switch (unit.toLowerCase()) {
            case "seconds":
                newPlanetTime = convertSeconds(earthTime);
                break;
            case "minutes":
                newPlanetTime = convertMinutes(earthTime);
                break;
            case "hours":
                newPlanetTime = convertHours(earthTime);
                break;
            case "days":
                newPlanetTime = convertDays(earthTime);
                break;
            default:
                System.out.println("Invalid unit of time. Please enter seconds, minutes, hours or days.");
                return;
        }

        System.out.println(earthTime + " " + unit + " on Earth is " + newPlanetTime + " days on the new planet.");
        displayTimeInDifferentFormats(newPlanetTime);
    }

    public static void main(String[] args) {
        double earthSeconds = 60;
        double newPlanetTime = convertSeconds(earthSeconds);
        System.out.println(earthSeconds + " seconds on Earth is " + newPlanetTime + " seconds on the new planet.");
        displayTimeInDifferentFormats(newPlanetTime);

        double earthMinutes = 60;
        double newPlanetTimeMinutes = convertMinutes(earthMinutes);
        System.out.println(earthMinutes + " minutes on Earth is " + newPlanetTimeMinutes + " minutes on the new planet.");
        displayTimeInDifferentFormats(newPlanetTimeMinutes);

        double earthHours = 24;
        double newPlanetTimeHours = convertHours(earthHours);
        System.out.println(earthHours + " hours on Earth is " + newPlanetTimeHours + " hours on the new planet.");
        displayTimeInDifferentFormats(newPlanetTimeHours);

        double earthDays = 365;
        double newPlanetTimeDays = convertDays(earthDays);
        System.out.println(earthDays + " days on Earth is " + newPlanetTimeDays + " days on the new planet.");
        displayTimeInDifferentFormats(newPlanetTimeDays);

        double earthYears = 1;
        double newPlanetTimeYears = convertYears(earthYears);
        System.out.println(earthYears + " years on Earth is " + newPlanetTimeYears + " years on the new planet.");
        displayTimeInDifferentFormats(newPlanetTimeYears);

        displayMaxValues();

        convertUserInput();
    }
}