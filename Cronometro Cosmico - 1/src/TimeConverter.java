public class TimeConverter {
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

public class Main {
    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter(1.5); // Supongamos que un día en el nuevo planeta es 1.5 días en la Tierra

        double earthSeconds = 60;
        double newPlanetTime = converter.convertSeconds(earthSeconds);
        System.out.println(earthSeconds + " seconds on Earth is " + newPlanetTime + " seconds on the new planet.");

        // Haz lo mismo para minutos, horas, días y años

        converter.displayMaxValues();
    }
}