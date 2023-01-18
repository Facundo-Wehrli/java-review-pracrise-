// 1. Diseñar un algoritmo que lea una cantidad de grados centígrados y la pase a grados
// Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit
// es: F = 32 + (9 * C / 5).

public class ejercicio1 {
    public static void main(String[] args) {
        //ingresamos los grados
        int grados = 25;
        System.out.println("grados =" + grados);
        // los pasamos a farenheit con la fórmula utilizando los grados que ingresamos
        int F = 32 + (9 * grados / 5);
        System.out.println("a farenheit = " + F);

    }

}