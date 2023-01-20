import java.util.Scanner;

// 3. Realizar el programa anterior con la estructura for
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un número");
            suma += obj.nextInt();
        }
        System.out.println("la suma da = " + suma);
        obj.close();
    }

}
