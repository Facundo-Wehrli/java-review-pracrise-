import java.util.Scanner;
// Ejercicio Final: Escribir una aplicación de consola Java que realice lo siguiente:
// 1. Crear un array de números y otro de String de 10 posiciones cada uno.
// 2. Solicitar al usuario que ingrese las notas entre 0 y 10. Se debe controlar que inserte
// una nota valida, pudiendo ser decimal la nota en el array de números. Guardar las
// notas en el array.
// 3. Solicitar al usuario que ingrese los nombres de los alumnos. Guardar en el array de
// Strings los nombres de los alumnos ingresados.
// 4. Luego mostrar por pantalla cada alumno, su nota y resultado. Se debe considerar para
// el resultado las siguientes validaciones:
// a. Si la nota esta entre 0 y 5,99 el resultado será “No aprobado”.
// b. Si la nota esta entre 6 y 6,99 el resultado será “Aprobado bueno”.
// c. Si la nota esta entre 7 y 8,99 el resultado será “Notable”.
// d. Si la nota esta entre 9 y 10 el resultado será “Sobresaliente”.

public class ejercicioFinal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // 1. Crear un array de números y otro de String de 10 posiciones cada uno.
        float[] notas = new float[10];
        String[] nombres = new String[10];
        // 2. Solicitar al usuario que ingrese las notas entre 0 y 10. Se debe controlar
        // que inserte
        // una nota valida, pudiendo ser decimal la nota en el array de números. Guardar
        // las
        // notas en el array.

        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese una nota");
            notas[i] = obj.nextFloat();
        }
        obj.nextLine();
        // 3. Solicitar al usuario que ingrese los nombres de los alumnos. Guardar en el
        // array de
        // Strings los nombres de los alumnos ingresados.
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ingrese un nombre de un alumno");
            nombres[i] = obj.nextLine();
        }

        // 4. Luego mostrar por pantalla cada alumno, su nota y resultado. Se debe
        // considerar para
        // el resultado las siguientes validaciones:
        // a. Si la nota esta entre 0 y 5,99 el resultado será “No aprobado”.
        // b. Si la nota esta entre 6 y 6,99 el resultado será “Aprobado bueno”.
        // c. Si la nota esta entre 7 y 8,99 el resultado será “Notable”.
        // d. Si la nota esta entre 9 y 10 el resultado será “Sobresaliente”.

        for (int i = 0; i < 10; i++) {
            String resultado = "";
            if (notas[i] < 6)
                resultado = "No aprobado";
            if (notas[i] > 6 && notas[i] < 7)
                resultado = "Aprobado bueno";
            if (notas[i] > 7 && notas[i] < 9)
                resultado = "Notable";
            if (notas[i] >= 9 && notas[i] <= 10) {
                resultado = "Sobresaliente";
            }
            System.out.println(
                    "Alumno: \"" + nombres[i] + "\" sacó = [" + notas[i] + "] por lo tanto su resultado es : "
                            + resultado);
        }

        obj.close();
    }

}
