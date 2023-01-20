import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Desarrollar un algoritmo que
        // 1)lea dos números ingresados por el usuario por teclado,(variables A y B)
        // 2) calcule y muestre por pantalla, el resultado de las cuatro operaciones
        // básicas, suma,
        // resta, multiplicación y división.

        // le pedimos los 2 números por teclado al usuario
        System.out.println("ingrese 1 número por teclado");
        int A = obj.nextInt();
        System.out.println("ingrese otro número por teclado");
        int B = obj.nextInt();
        int suma = A + B;
        System.out.println("suma = " + suma);
        int resta = A - B;
        System.out.println("resta = " + resta);
        int multiplicación = A * B;
        System.out.println("multiplicación = " + multiplicación);
        int división = A / B;
        System.out.println("división = " + división);

    }
}
