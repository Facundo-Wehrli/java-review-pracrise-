import java.util.Scanner;

// 1) Desarrollar un algoritmo que considere dos variables numéricas A y B, que el usuario
// debe teclear, se pide que se intercambie los valores de ambas variables y muestre
// cuánto valen al final las dos variables (recordar el comando de asignación).

public class ejercicio1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    // 2 variables numéricas A y B que el usuario debe teclear
    System.out.println("ingrese un número");
    int A = obj.nextInt();
    System.out.println("el número A : " + A);
    System.out.println("ingrese otro número");
    int B = obj.nextInt();
    System.out.println("el número B : " + B);
    // utilizamos una variable auxiliar para realizar el intercambio
    int C;
    C = A;
    A = B;
    B = C;
    // mostramos el reultado del intercambio por pantalla
    System.out.println("ahora el valor de A es = " + A + " y el valor de B es = " + B);
    obj.close();
  }
}