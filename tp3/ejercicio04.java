// Ejercicio 4 – Repetitiva Para (For)
// Diseñar un algoritmo que realice el promedio de 4 números. Los números podrán ser
// decimales y serán ingresados por pantalla por el usuario.

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float suma = 0;
        float promedio = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese 1 número");
            float nums = obj.nextFloat();   
            suma += nums;
        }
        promedio = suma / 4;
        System.out.println("el promedio es = " + promedio);
    }
}
