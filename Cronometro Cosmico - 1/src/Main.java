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

    public static void displayMaxValues() {
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
    }

    public static void main(String[] args) {
        double earthSeconds = 60;
        double newPlanetTime = convertSeconds(earthSeconds);
        System.out.println(earthSeconds + " seconds on Earth is " + newPlanetTime + " seconds on the new planet.");

        double earthMinutes = 60;
        double newPlanetTimeMinutes = convertMinutes(earthMinutes);
        System.out.println(earthMinutes + " minutes on Earth is " + newPlanetTimeMinutes + " minutes on the new planet.");

        double earthHours = 24;
        double newPlanetTimeHours = convertHours(earthHours);
        System.out.println(earthHours + " hours on Earth is " + newPlanetTimeHours + " hours on the new planet.");

        double earthDays = 365;
        double newPlanetTimeDays = convertDays(earthDays);
        System.out.println(earthDays + " days on Earth is " + newPlanetTimeDays + " days on the new planet.");

        double earthYears = 1;
        double newPlanetTimeYears = convertYears(earthYears);
        System.out.println(earthYears + " years on Earth is " + newPlanetTimeYears + " years on the new planet.");

        displayMaxValues();
    }
}