package ejercicio1;

import java.util.Scanner;

public class Licencia_de_condución {
    public static void main(String[] args) {
        // Comprueba si una persona puede conducir un auto o no
        /* Para introduccir datos se necesita la opción Scanner para que se
        introduzca automáticamente el import java.util.Scanner; */

        Scanner scanner = new Scanner(System.in);

        // Eingaben:
        System.out.println("Gib dein Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Hast du einen Führerschein? (true/false): ");
        boolean fuehrerschein = scanner.nextBoolean();

        // Bedingung prüfen
        if (alter >= 18 && fuehrerschein) {
            System.out.println("Du darfst Auto fahren");
        }else {
            System.out.println("Du darfst nicht Auto fahren");
        }
        scanner.close();
    }
}
