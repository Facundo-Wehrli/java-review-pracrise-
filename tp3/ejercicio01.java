// Ejercicio 1 – Alternativa Múltiple
// Diseñar un algoritmo que devuelva el nombre del mes, a partir del número de mes, ingresado
// por teclado, por el usuario. Si el usuario ingresa un número de mes que no exista, se deberá
// mostrar un mensaje indicando que el número ingresado no es correcto.

//1: pedir 1 número del mes
//2:mostrar mensaje de error en el caso de que  el número no exista
//3 mostrar el més del número que inresó
import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // pido el número del mes
        System.out.println("Ingrese el número de un mes");
        int mes = obj.nextInt();
        // muestro error en caso de que ponga un número incorrecto
        if (mes > 12 || mes < 0) {
            System.out.println("número incorrecto ");
        } else {
            switch (mes) {
                case 1:
                    System.out.println("enero");
                    break;
                case 2:
                    System.out.println("febrero");
                    break;
                case 3:
                    System.out.println("marzo");
                    break;
                case 4:
                    System.out.println("abril");
                    break;
                case 5:
                    System.out.println("mayo");
                    break;
                case 6:
                    System.out.println("junio");
                    break;
                case 7:
                    System.out.println("julio");
                    break;
                case 8:
                    System.out.println("agosto");
                    break;
                case 9:
                    System.out.println("septiembre");
                    break;
                case 10:
                    System.out.println("octubre");
                    break;
                case 11:
                    System.out.println("nobiembre");
                    break;
                case 12:
                    System.out.println("diciembre");
                    break;

                default:
                    break;
            }
        }
        obj.close();
    }
}
