package condicionales;

public class While {
    public static void main(String[] args) {
        for (int i = 2; i<=5 ; i++) {
            System.out.println("Valor: " + i);
        }
        System.out.println("sale");

        int counter=0;
        int acumulador=0;
        while (counter<5){
            System.out.println("Counter: " + counter);
            acumulador = acumulador+counter;
            counter++;
            System.out.println("acumulador = " + acumulador);

//            do / while
            int counter2=0;
            do {
                counter2++;
                System.out.println("counter2 = " + counter2);
            }while (counter2<5);
        }
    }
}
