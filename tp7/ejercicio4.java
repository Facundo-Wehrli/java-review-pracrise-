// Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.
// Realiza el mismo ejercicio utilizando la instrucción do..while y otro utilizando la
// instrucción for. ¿Cuál de las tres estructuras consideras más eficiente para la
// resolución del ejercicio?

public class ejercicio4 {

    public static void main(String[] args) {
        // using while
        int n = 100;
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        //using do-while
        int n1 = 100;
        do {
            System.out.println(n1);
            n1 = n1 - 1;
        } while (n1 > 0);
        //using for
        for(int n3 = 100; n > 0; n3 = n3 - 1)
            {
                System.out.println(n3);
            }

    }

}
