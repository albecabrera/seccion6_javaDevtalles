package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age  = 19;
        double average = 7.5;
        boolean isAdult = age > 17;
        boolean hasPassingGrade = average>=7;
        if (hasPassingGrade && average>=7){
            System.out.println("El estudiante cumple todos los requisitos");
        }
/*        int day = 1 ;
            switch (day){
                case 1:
                    System.out.println("Hoy es lunes");
                case 2:
                    System.out.println("Hoy es martes");
                case 3:
                    System.out.println("Hoy es Miércoles");
                break;
                    default:
*/                  System.out.println("El dato ingresado no es válido"); // Ejemplos de buenas prácticas
        }
    }

