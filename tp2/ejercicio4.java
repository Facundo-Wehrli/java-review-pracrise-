import java.util.Scanner;

public class ejercicio4 {
    // Desarrollar un algoritmo que lea tres números distintos ingresados por el
    // usuario por
    // el teclado y nos diga cuál de ellos es el mayor (deberás usar la estructura
    // condicional Si
    // y los operadores lógicos).
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // lea 3 nùmeros ingresados por teclado llamaremos A, B, C
        System.out.println("ingrese el primer nùmero");
        int A = obj.nextInt();
        System.out.println("ingrese el segundo nùmero");
        int B = obj.nextInt();
        System.out.println("ingrese el tercer nùmero");
        int C = obj.nextInt();
        // condiciones para chequear cual de los 3 es mayor
        if (A > B && A > C)
            System.out.println("el primero es el màs grande");
        if (B > A && B > C)
            System.out.println("el segudno es el màs grande");
        if (C > A && C > B)
            System.out.println("el tercero es el màs grande");

        obj.close();
    }
}
