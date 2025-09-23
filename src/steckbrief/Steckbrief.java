package steckbrief;

public class Steckbrief {
    public static void main(String[] args) {
        String name;
        byte age;
        short groeße;
        int einkommen;
        double gewicht;
        char geschlecht;
        boolean istcool;

        name = "Alberto";
        age = 47;
        groeße = 171;
        einkommen = 5000;
        gewicht = 80;
        geschlecht = 'm';
        istcool = true;

        System.out.println("Steckbrief: ");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("groeße = " + groeße);
        System.out.println("einkommen = " + einkommen);
        System.out.println("gewicht = " + gewicht);
        System.out.println("geschlecht = " + geschlecht);
        System.out.println("istcool = " + istcool);

        // if else-Anweisung
        int temperatur = 1;
        if (temperatur <=3) {
            System.out.println("Perfekt, das Bier ist bereit, getrunken zu werden");
        }else {
            System.out.println("Nee, ich habe keine Lust auf warmes Bier 🤮");
        }

        // switch
        switch (temperatur) {
            case 0:
                System.out.println("Das Bier hat null Grad!");
                break;
            case 1:
                System.out.println("Das Bier hat einen Grad!");
                break;
            default:
                System.out.println("Das Bier hat eine andere Temperatur");
                break;
        }

    }
}