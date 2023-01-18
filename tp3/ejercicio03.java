// Ejercicio 3 – Repetitiva Hacer Mientras (Do While)
// Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del número que
// ingrese el usuario. Para definir hasta que número desea que muestre la tabla de multiplicación
// el usuario también deberá ingresar este valor. La tabla de multiplicación a mostrar debe
// empezar en la multiplicación por 1.

//mismo ejercicio que el anterior pero uso do while
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // pido número al usuario
        System.out.println("ingrese un número");
        int num = obj.nextInt();
        int producto;
        System.out
                .println("ingres el número para definir hasta que número desea que muestre la tabal de multiplicación");
        int multiplicarHasta = obj.nextInt();
        int i = 1;

        do {
            producto = num * i;
            System.out.println(num + "*" + i + " = " + producto);
            i++;
        } while (i <= multiplicarHasta);

        obj.close();
    }
}
