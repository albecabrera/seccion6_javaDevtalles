package ejercicio2;

public class CalcularPromedio {
    public static void main(String[] args) {
        // Calcular el promedio de notas
        double note1 = 2;
        double note2 = 4;
        double durschnitt = (note1+note2)/2; // Da die Regel Punkt vor Strich gilt,
        // muss man zuerst die Addition in Klammern setzen und erst dann die Division außerhalb
        // der Klammern
        System.out.println("Der Notendurschnitt beträgt = " + durschnitt);
    }
}
