// Ejercicio 1 – Array Booleano
// Diseñar un programa que recorra las butacas de una sala de cine y determine cuántas butacas
// desocupadas hay en la sala. Suponga que inicialmente tiene un array con valores booleanos
// que si es true (verdadero) implica que está ocupada y si es false (falso) la butaca está
// desocupada. Tenga en cuenta que el array deberá ser creado e inicializado al principio del
// algoritmo.
public class ejercicio1 {
    public static void main(String[] args) {
        boolean[] butacas = { true, false, false, false, false, false, false, false, false, true, true, true, false };
        for (int i = 0; i < butacas.length; i++) {
            if (butacas[i]==true) {
                System.out.println("la butaca número ("+i+") está ocupada");
            } 
            else System.out.println("la butaca número ("+i+ ")está desocupada");
        }

    }
}
