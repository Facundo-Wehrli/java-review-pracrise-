import java.util.Scanner;

public class ejercicio6 {
    // 6. Resolver el ejercicio anterior (5) con la estructura for
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int numeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un número negativo o positivo");
            numeros = obj.nextInt();
            if (numeros < 0)
                negativos++;
            else
                positivos++;
        }
        System.out.println("he contabilizado (" + negativos + ") numeros negativos");
        System.out.println("he contabilizado (" + positivos + ") numeros positivos");
        obj.close();
    }
}
