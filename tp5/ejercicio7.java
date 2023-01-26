import java.util.Scanner;

public class ejercicio7 {
    // 7. Realizar un programa en Java que realice la correspondencia entre nota y
    // valor.
    // a. Suficiente 5
    // b. Bien 6
    // c. Notable bajo 7
    // d. Notable alto 8
    // e. Sobresaliente 9
    // f. Matrícula de honor 10
    // g. Suspenso valores menores de 5
    // h. Nota Superior valores superiores a 10
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int nota = obj.nextInt();
        String corresponde = "";

        switch (nota) {
            case 5:
                corresponde = "Suficiente";
                break;
            case 6:
                corresponde = "Bien";
                break;
            case 7:
                corresponde = "Notable bajo";
                break;
            case 8:
                corresponde = "Notable alto";
                break;
            case 9:
                corresponde = "Sobresaliente";
                break;
        }
        if (nota > 10)
            corresponde = "Nota superior";
        if (nota < 5)
            corresponde = "Suspenso";
        System.out.println(corresponde);
        obj.close();

    }

}
