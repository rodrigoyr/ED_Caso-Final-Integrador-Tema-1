public class Main {
    public static void main(String[] args) {
        // Cronómetro Cósmico
        calcularTiempo();
        mostrarValoresMaximos();
    }

    public static void calcularTiempo() {
        long tiempoTierraSegundos = System.currentTimeMillis() / 1000; // Tiempo en segundos
        long tiempoTierraMinutos = tiempoTierraSegundos / 60; // Tiempo en minutos
        long tiempoTierraHoras = tiempoTierraMinutos / 60; // Tiempo en horas
        long tiempoTierraDias = tiempoTierraHoras / 24; // Tiempo en días
        long tiempoTierraAnos = tiempoTierraDias / 365; // Tiempo en años

        System.out.println("Tiempo en la Tierra: " + tiempoTierraSegundos + " segundos, " + tiempoTierraMinutos + " minutos, " + tiempoTierraHoras + " horas, " + tiempoTierraDias + " días, " + tiempoTierraAnos + " años");

        // Supongamos que el tiempo en el nuevo planeta es el doble que en la Tierra
        long tiempoPlanetaSegundos = tiempoTierraSegundos * 2;
        long tiempoPlanetaMinutos = tiempoTierraMinutos * 2;
        long tiempoPlanetaHoras = tiempoTierraHoras * 2;
        long tiempoPlanetaDias = tiempoTierraDias * 2;
        long tiempoPlanetaAnos = tiempoTierraAnos * 2;

        System.out.println("Tiempo en el nuevo planeta: " + tiempoPlanetaSegundos + " segundos, " + tiempoPlanetaMinutos + " minutos, " + tiempoPlanetaHoras + " horas, " + tiempoPlanetaDias + " días, " + tiempoPlanetaAnos + " años");
    }

    public static void mostrarValoresMaximos() {
        System.out.println("Máximo valor para byte: " + Byte.MAX_VALUE);
        System.out.println("Máximo valor para short: " + Short.MAX_VALUE);
        System.out.println("Máximo valor para int: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor para long: " + Long.MAX_VALUE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor para double: " + Double.MAX_VALUE);
    }
}