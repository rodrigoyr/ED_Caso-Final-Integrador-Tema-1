import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mostrar los valores máximos
        mostrarValoresMaximos();

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tiempo en la Tierra
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

        // Calcular y mostrar el tiempo en el nuevo planeta
        calcularTiempo(tiempoTierraSegundos);

        // Solicitar al usuario que ingrese la cantidad de recursos consumidos por día
        System.out.println("Por favor, ingresa la cantidad de recursos consumidos por día:");
        int recursosPorDia = scanner.nextInt();

        System.out.println("Por favor, especifica el número de días, semanas o meses para los que se debe calcular el consumo (en múltiplos de 5):");
        int periodo = scanner.nextInt();

        System.out.println("Por favor, ingresa la cantidad total de recursos disponibles:");
        int totalRecursos = scanner.nextInt();

        // Calcular y mostrar el consumo de recursos
        calcularConsumoRecursos(recursosPorDia, periodo, totalRecursos);
    }

    public static void calcularTiempo(long tiempoTierraSegundos) {
        long tiempoPlanetaSegundos = tiempoTierraSegundos * 2;
        long tiempoPlanetaMinutos = tiempoPlanetaSegundos / 60;
        long tiempoPlanetaHoras = tiempoPlanetaMinutos / 60;
        long tiempoPlanetaDias = tiempoPlanetaHoras / 24;
        long tiempoPlanetaAnos = tiempoPlanetaDias / 365;

        System.out.printf("Tiempo en el nuevo planeta: %d segundos, %d minutos, %d horas, %d días, %d años%n", tiempoPlanetaSegundos, tiempoPlanetaMinutos, tiempoPlanetaHoras, tiempoPlanetaDias, tiempoPlanetaAnos);
    }

    public static void calcularConsumoRecursos(int recursosPorDia, int periodo, int totalRecursos) {
        int consumoTotal = recursosPorDia * periodo;
        int media = consumoTotal / periodo;
        int minimo = recursosPorDia;
        int maximo = consumoTotal;
        int recursosRestantes = totalRecursos - consumoTotal;

        System.out.printf("Consumo total de recursos: %d%n", consumoTotal);
        System.out.printf("Media de recursos consumidos: %d%n", media);
        System.out.printf("Mínimo de recursos consumidos: %d%n", minimo);
        System.out.printf("Máximo de recursos consumidos: %d%n", maximo);
        System.out.printf("Recursos restantes: %d%n", recursosRestantes);
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