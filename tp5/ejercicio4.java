import java.util.Scanner;

// 4. Realizar un programa en Java que lea un número por teclado y muestre a qué día de la
// semana corresponde. Si el número leído es 1 visualizará “Lunes”, si es 2 visualizará
// “Martes”, si es 3 visualizará “Miércoles”, y así sucesivamente … Para cualquier otro
// valor visualizará “No válido”.
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese un número y se mostrará el día de la semana que le corresponde");
        int dia = obj.nextInt();

        if (dia > 0 && dia < 8) {
            switch (dia) {
                case 1:
                    System.out.println("lunes");
                    break;
                case 2:
                    System.out.println("martes");
                    break;
                case 3:
                    System.out.println("miércoles");
                    break;
                case 4:
                    System.out.println("jueves");
                    break;
                case 5:
                    System.out.println("viernes");
                    break;
                case 6:
                    System.out.println("sábado");
                    break;
                case 7:
                    System.out.println("domingo");
                    break;
            }
        } else
            System.out.println("no válido");
        obj.close();
    }
}
