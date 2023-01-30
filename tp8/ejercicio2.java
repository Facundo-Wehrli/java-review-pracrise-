import java.util.Scanner;
// Ejercicio 2 – Diseñar un programa que calcula la suma total de una serie de números
// ingresados por teclado. El programa deberá leer 10 números enteros y los debe guardar en un
// array. Luego realizar la suma de todos los números y mostrar por pantalla el resultado final.

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int suma = 0;
        int[] arrey = new int[10];
        for (int i = 0; i < arrey.length; i++) {
            System.out.println("ingrese 1 número");
            arrey[i] = obj.nextInt();
            suma += arrey[i];
        }
        System.out.println("el resultado de la suma es = " + suma);
        obj.close();
    }
}
