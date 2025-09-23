package operadores;

public class Operatoren {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;

        int ergebnis = value1 + value2;
        int differenz = value1 - value2;
        int division = value1 / value2;   // Achtung: Ganzzahldivision!
        int produkt = value1 * value2;

        System.out.println("Ergebnis der Summe = " + ergebnis);
        System.out.println("Ergebnis der Differenz = " + differenz);
        System.out.println("Ergebnis der Division = " + division);
        System.out.println("Ergebnis des Produkts = " + produkt);
    }
}