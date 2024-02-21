public class Main {
    public static void main(String[] args) {
        // Cronómetro Cósmico
        long tiempoTierra = System.currentTimeMillis() / 1000; // Tiempo en segundos
        long tiempoPlaneta = tiempoTierra * 2; // Supongamos que el tiempo en el nuevo planeta es el doble que en la Tierra

        // Recursos y Suministros
        int agua = 100; // Cantidad inicial de agua
        int comida = 100; // Cantidad inicial de comida
        int oxigeno = 100; // Cantidad inicial de oxígeno
        int dias = 5; // Consumo cada 5 días
        agua -= dias * 2; // Supongamos que se consumen 2 unidades de agua al día
        comida -= dias * 3; // Supongamos que se consumen 3 unidades de comida al día
        oxigeno -= dias * 4; // Supongamos que se consumen 4 unidades de oxígeno al día

        // Sistema de Alerta y Monitoreo
        int radiacion = 50; // Nivel de radiación
        int temperatura = 20; // Temperatura
        int presion = 1000; // Presión
        if (radiacion > 100 || temperatura > 40 || presion > 2000) {
            System.out.println("Alerta: valores extremos detectados");
        }

        // Planificador de Tareas
        String[] tripulacion = {"Miembro1", "Miembro2", "Miembro3"};
        String[] tareas = {"Tarea1", "Tarea2", "Tarea3"};
        for (int i = 0; i < tripulacion.length; i++) {
            System.out.println(tripulacion[i] + " debe realizar la " + tareas[i]);
        }

        // Navegador Estelar
        int[][] terreno = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] construcciones = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += terreno[i][k] * construcciones[k][j];
                }
            }
        }

        // Comunicador Interplanetario
        String mensaje = "Hola Mundo";
        int vocales = 0;
        for (char c : mensaje.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vocales++;
            }
        }
        String invertido = new StringBuilder(mensaje).reverse().toString();
        boolean esPalindromo = mensaje.equalsIgnoreCase(invertido);
    }
}