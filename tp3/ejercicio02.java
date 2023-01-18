// Ejercicio 2 – Repetitiva Mientras (While)
// Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del número que
// ingrese el usuario. Para definir hasta que número desea que muestre la tabla de multiplicación
// el usuario también deberá ingresar este valor. La tabla de multiplicación a mostrar debe
// empezar en la multiplicación por 1.
import java.util.Scanner;
public class ejercicio02 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
          //1:pedir nùmero al usuario
          System.out.println("ingrese un nùmero");
        int num = obj.nextInt();
        //mostrar tabla de multiplicar del nùmero



        obj.close();
    }
}
