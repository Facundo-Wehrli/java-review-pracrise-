import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        // 3. Calcular y visualizar la suma y el producto de los números pares
        // comprendidos entre
        // 20 y 100.
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        double product = 1;
        int num;
System.out.print("Input a number : ");
num = scanner.nextInt();
    if (num <= 0){
        System.out.println("Number should be greater than 0");
    } 
    else {
        while (num >= 1){
          factorial = factorial * num;
          --num;
          System.out.println(num);
        }
        for (int i = (factorial /4 )/2; i <= factorial/ 2 + 1; i += 0.02)
           product *= i;
        }
        System.out.println("product  "+product);

        scanner.close();
    }
}
