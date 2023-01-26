import java.util.Scanner;

// Escribir un programa que solicite al usuario que ingrese un numero entre 0 y 999, y
// nos muestre un mensaje de cuantos dígitos tiene el número. El programa se finaliza
// cuando se cargue el valor 0.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        do {
            System.out.println("ingrese un número");
            num = obj.nextInt();
            if (num > 0 && num < 10)
                System.out.println("tiene 1 dígito");
            if (num > 9 && num < 100)
                System.out.println("tiene 2 dígitos");
            if (num > 99 && num < 1000)
                System.out.println("tiene 3 dígitos");
        } while (num != 0);
        System.out.println("programa finalizado");
        obj.close();
    }
}
