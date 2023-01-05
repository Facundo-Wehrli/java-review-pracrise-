import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args){
//     Desarrollar un algoritmo que lea dos números ingresados por el usuario por teclado, y
// calcular cuál es el mayor o bien, si son iguales (deberás utilizar la estructura if).
Scanner obj = new Scanner(System.in);
//1)leer 2 números ingresados por teclado
int A = obj.nextInt();
int B = obj.nextInt();
// calculo si el primero es el mayor
if (A>B) System.out.println("A mayor");
// calculo si el segundo es el mayor
if (A<B) System.out.println("B mayor");
// si no es ninguna de las anteriores es porque son iguales
else System.out.println("iguales");


//2) calcular cual es el mayor o bien, si son iguales

}
}
