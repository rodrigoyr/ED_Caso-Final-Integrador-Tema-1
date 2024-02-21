import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cronómetro Cósmico
        long tiempoTierraSegundos = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.println("Por favor, ingresa el tiempo en la Tierra:");
                long tiempoTierra = scanner.nextLong();
                System.out.println("Por favor, especifica la unidad de tiempo (segundos, minutos, horas, dias, años):");
                String unidadTiempo = scanner.next().toLowerCase();
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
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, intenta de nuevo.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        long tiempoPlanetaSegundos = tiempoTierraSegundos * 2; // Suponiendo que un día en el nuevo planeta dura el doble que en la Tierra
        System.out.printf("Tiempo en el nuevo planeta: %d segundos%n", tiempoPlanetaSegundos);

        // Recursos y Suministros
        System.out.println("Por favor, ingresa la cantidad de recursos consumidos por día:");
        int recursosPorDia = scanner.nextInt();
        System.out.println("Por favor, especifica el número de días, semanas o meses para los que se debe calcular el consumo (en múltiplos de 5):");
        int periodo = scanner.nextInt();
        int consumoTotal = recursosPorDia * periodo;
        System.out.printf("Consumo total de recursos: %d%n", consumoTotal);

        // Sistema de Alerta y Monitoreo
        System.out.println("Por favor, ingresa el nivel de radiación actual:");
        int radiacion = scanner.nextInt();
        System.out.println("Por favor, ingresa la temperatura actual:");
        int temperatura = scanner.nextInt();
        System.out.println("Por favor, ingresa la presión actual:");
        int presion = scanner.nextInt();
        if (radiacion > 100 || temperatura > 100 || presion > 100) {
            System.out.println("Alerta: Valores extremos detectados.");
        }

        // Planificador de Tareas
        System.out.println("Por favor, ingresa el número de tareas a asignar:");
        int tareas = scanner.nextInt();
        for (int i = 1; i <= tareas; i++) {
            System.out.printf("Tarea %d asignada%n", i);
        }

        // Navegador Estelar
        System.out.println("Por favor, ingresa el tamaño del terreno (un número entero):");
        int tamano = scanner.nextInt();
        int[][] terreno = new int[tamano][tamano];
        System.out.println("Terreno creado.");

        // Comunicador Interplanetario
        System.out.println("Por favor, ingresa un mensaje para enviar a la Tierra:");
        String mensaje = scanner.next();
        int vocales = contarVocales(mensaje);
        String invertido = new StringBuilder(mensaje).reverse().toString();
        boolean esPalindromo = mensaje.equals(invertido);
        System.out.printf("El mensaje tiene %d vocales. Invertido, se lee: %s. ¿Es un palíndromo? %b%n", vocales, invertido, esPalindromo);
    }

    public static int contarVocales(String mensaje) {
        int contador = 0;
        String vocales = "aeiou";
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}