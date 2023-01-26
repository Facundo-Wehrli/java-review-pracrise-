import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // 3. Escribir un programa donde se ingresa un conjunto de n edades de personas
        // por
        // teclado. El programa finalizara cuando el promedio de las edades sea superior
        // a 25.
     
        int edades, total, promedio, i;
        i = 1;
        total = 0;
        // Asking for an age and then adding it to the total. Then it is dividing the total by the
        // number of ages entered. Then it is adding one to the number of ages entered. Then it is
        // checking if the average is less than 25. If it is, it will ask for another age.
        do {
            System.out.println("ingrese una edad");
            edades = obj.nextInt();
            total += edades;
            promedio = total / i;
            i++;
        } while (promedio < 25);
        System.out.println("promedio superado, promedio :"+promedio);

        obj.close();
    }
}
