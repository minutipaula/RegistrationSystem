package minutiPaula;

import java.util.Scanner;

public class Consola {
    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Tiene ingresar un numero entero.");
            }
        }
    }

    public static String leerString(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = sc.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.println("El campo no puede estar vacio.");
        }
    }
}
