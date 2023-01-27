import java.util.Scanner;

// Mostrar los números sucesivos hasta 20, de un numero ingresado por teclado, cabe
// indicar que el numero debe ser menor de 20.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese un número menor a 20");
        for (int i = obj.nextInt(); i < 21; i++) {
            System.out.println(i);
        }
        obj.close();
    }
}
