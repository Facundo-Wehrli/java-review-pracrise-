
// Diseñar un algoritmo que no permita continuar hasta que el usuario no introduzca la
// contraseña correcta.
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String pass = "password";
        String validar;
        do {
            System.out.println("ingrese su contraseña");
            validar = obj.next();
        } while (!pass.equals(validar));
        System.out.println("felicitaciones pudo ingresar correctamente");
        obj.close();
    }
}
