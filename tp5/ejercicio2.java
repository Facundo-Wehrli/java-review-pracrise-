import java.util.Scanner;

// 2. Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la
// suma. Realizar el programa con la estructura do-while
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        
        do {
            System.out.println("ingrese un número");
            suma += obj.nextInt();
            i++;
        } while (i < 10);
        System.out.println("la suma da = " + suma);

        obj.close();
    }
}
