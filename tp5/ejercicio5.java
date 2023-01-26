import java.util.Scanner;

public class ejercicio5 {
    // 5. Realizar un programa en Java que pida 10 números por teclado, haga la suma
    // de esos
    // 10 números pasados por teclado, cuente los números positivos y cuente los
    // números
    // negativos. Usar la estructura do-while

    // 1 pedir 10 números por teclado
    // 2 contar los números positivos y negativos
    // utilizando do-while
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numeros, positivos, negativos, i;
        i = 0;
        positivos = 0;
        negativos = 0;

        do {
            System.out.println("ingrese un número");
            numeros = obj.nextInt();
            if (numeros < 0)
                negativos++;
            else
                positivos++;
            i++;
        } while (i < 10);
        System.out.println("he  contabilizado " + negativos + " números negativos");
        System.out.println("también he contabilizado " + positivos + " números positivos");

        obj.close();
    }

}
