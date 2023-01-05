import java.util.Scanner;
public class ejercicio5 {
//     Desarrollar un algoritmo que pida por teclado tres números, si el primero es negativo,
// debe imprimir el producto de los tres y si no lo es, imprimirá la suma.
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        // 1) pedir por teclado 3 números
        System.out.println("ingres el primer número");
        int A = obj.nextInt();
        System.out.println("ingrese el segundo número");
        int B = obj.nextInt();
        System.out.println("ingrese el tercer número");
        int C = obj.nextInt();

        if (A<0){
            System.out.println(A*B*C);
        }

        System.out.println(A+B+C);
    }
}
