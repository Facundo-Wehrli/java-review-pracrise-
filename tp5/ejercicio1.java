import java.util.Scanner;

// 1. Realizar un programa en Java que lea dos números pasados por teclado en un proceso
// repetitivo. Este proceso terminará cuando los números leídos sean iguales.
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // utilizaremos la estructura repetititiva do while
        int num1, num2;
        do {
            System.out.println("primer número");
            num1 = obj.nextInt();
            System.out.println("segundo número");
            num2 = obj.nextInt();
        } while (num1 != num2);
        System.out.println("son iguales ");
        obj.close();
    }
}
