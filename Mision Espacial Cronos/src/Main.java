import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cronómetro Cósmico
        mostrarValoresMaximos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa el tiempo en la Tierra:");
        long tiempoTierra = scanner.nextLong();

        System.out.println("Por favor, especifica la unidad de tiempo (segundos, minutos, horas, dias, años):");
        String unidadTiempo = scanner.next().toLowerCase();

        long tiempoTierraSegundos;
        switch (unidadTiempo) {
            case "minutos":
                tiempoTierraSegundos = tiempoTierra * 60;
                break;
            case "horas":
                tiempoTierraSegundos = tiempoTierra * 60 * 60;
                break;
            case "dias":
                tiempoTierraSegundos = tiempoTierra * 60 * 60 * 24;
                break;
            case "años":
                tiempoTierraSegundos = tiempoTierra * 60 * 60 * 24 * 365;
                break;
            case "segundos":
            default:
                tiempoTierraSegundos = tiempoTierra;
                break;
        }

        calcularTiempo(tiempoTierraSegundos);
    }

    public static void calcularTiempo(long tiempoTierraSegundos) {
        // Supongamos que el tiempo en el nuevo planeta es el doble que en la Tierra
        long tiempoPlanetaSegundos = tiempoTierraSegundos * 2;
        long tiempoPlanetaMinutos = tiempoPlanetaSegundos / 60;
        long tiempoPlanetaHoras = tiempoPlanetaMinutos / 60;
        long tiempoPlanetaDias = tiempoPlanetaHoras / 24;
        long tiempoPlanetaAnos = tiempoPlanetaDias / 365;

        System.out.printf("Tiempo en el nuevo planeta: %d segundos, %d minutos, %d horas, %d días, %d años%n", tiempoPlanetaSegundos, tiempoPlanetaMinutos, tiempoPlanetaHoras, tiempoPlanetaDias, tiempoPlanetaAnos);
    }

    public static void mostrarValoresMaximos() {
        // El resto del código permanece igual
    }
}
