// 1) Desarrollar un algoritmo que considere dos variables numéricas A y B, que el usuario
// debe teclear, se pide que se intercambie los valores de ambas variables y muestre
// cuánto valen al final las dos variables (recordar el comando de asignación).

public class App {
        public static void main (String[] args){
            //2 variables numéricas A y B que el usuario debe teclear
            int A = 2;
            int B = 3;
            System.out.println(A);
            System.out.println(B);
            System.out.println("ahora cambiados: ");
            int C = 0;
            C = A;
            A = B;
            B = C;
            System.out.println(A);
            System.out.println(B);
        }
}