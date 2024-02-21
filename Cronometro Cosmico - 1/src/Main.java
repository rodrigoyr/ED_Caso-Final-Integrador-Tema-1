public class Main {
    private double dayLengthOnNewPlanet;

    public TimeConverter(double dayLengthOnNewPlanet) {
        this.dayLengthOnNewPlanet = dayLengthOnNewPlanet;
    }

    public double convertSeconds(double seconds) {
        double days = seconds / (24 * 60 * 60);
        return days * dayLengthOnNewPlanet;
    }

    public double convertMinutes(double minutes) {
        double days = minutes / (24 * 60);
        return days * dayLengthOnNewPlanet;
    }

    public double convertHours(double hours) {
        double days = hours / 24;
        return days * dayLengthOnNewPlanet;
    }

    public double convertDays(double days) {
        return days * dayLengthOnNewPlanet;
    }

    public double convertYears(double years) {
        double days = years * 365;
        return days * dayLengthOnNewPlanet;
    }

    public void displayMaxValues() {
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
    }
}