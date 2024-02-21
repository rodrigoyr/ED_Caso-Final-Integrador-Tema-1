public class Main {
    public static void main(String[] args) {

        double earthSeconds = 60;
        double newPlanetTimeSeconds = converter.convertSeconds(earthSeconds);
        System.out.println(earthSeconds + " seconds on Earth is " + newPlanetTimeSeconds + " seconds on the new planet.");

        double earthMinutes = 60;
        double newPlanetTimeMinutes = converter.convertMinutes(earthMinutes);
        System.out.println(earthMinutes + " minutes on Earth is " + newPlanetTimeMinutes + " minutes on the new planet.");

        double earthHours = 24;
        double newPlanetTimeHours = converter.convertHours(earthHours);
        System.out.println(earthHours + " hours on Earth is " + newPlanetTimeHours + " hours on the new planet.");

        double earthDays = 365;
        double newPlanetTimeDays = converter.convertDays(earthDays);
        System.out.println(earthDays + " days on Earth is " + newPlanetTimeDays + " days on the new planet.");

        double earthYears = 1;
        double newPlanetTimeYears = converter.convertYears(earthYears);
        System.out.println(earthYears + " years on Earth is " + newPlanetTimeYears + " years on the new planet.");

        converter.displayMaxValues();
    }
}