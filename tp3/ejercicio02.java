
// Ejercicio 2 – Repetitiva Mientras (While)
// Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del número que
// ingrese el usuario. Para definir hasta que número desea que muestre la tabla de multiplicación
// el usuario también deberá ingresar este valor. La tabla de multiplicación a mostrar debe
// empezar en la multiplicación por 1.
import java.util.Scanner;

public class ejercicio02 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    // 1:pedir nùmero al usuario
    System.out.println("ingrese un nùmero");
    int num = obj.nextInt();
    // creo el número que va ser el factor que aumenta de 1 en 1 que multiplicará el
    // número ingresado
    int i = 1;
    System.out.println("ingrese hasta que número desea mostrar la tabla de multiplicación");
    int multiplicarHasta = obj.nextInt();
    // creo una variable donde guardaré el producto de cada multiplicación
    int producto;
    //mientras el segundo factor incremental sea menor o igual que el número tope de ese factor que pusimos, 
    //el número ingresado se continuará multiplicando por dicho incremental.
    while (i <= multiplicarHasta) {
      producto = num * i;
      System.out.println(num + "*" + i + " = " + producto);
      i++;
    }
    obj.close();
  }
}
