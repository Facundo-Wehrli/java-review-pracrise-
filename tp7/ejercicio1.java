
// 1. Crear un programa que solicite al usuario que ingrese el nombre de una fruta y esta se
// repita 10 veces.
import java.util.Scanner;

class ejercicio1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String faruitName;
        faruitName = keyboard.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(faruitName + ", ");
        }
        System.out.println("!Fin del programa");
        keyboard.close();
    }
}
