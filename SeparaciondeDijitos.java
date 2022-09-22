package Metodos;

import java.util.Scanner;

public class SeparaciondeDijitos {

    public void Imprime(int x) {

        int digito1;
        int digito2;
        int digito3;
        int digito4;
        int digito5;
        int residuo;

        digito1 = x / 10000;
        x %= 10000;

        digito2 = x / 1000;
        x %= 1000;

        digito3 = x / 100;
        x %= 100;

        digito4 = x / 10;
        x %= 10;

        digito5 = x;

        if (0 != digito1) {
            System.out.printf("%3d", digito1);
        }

        if (0 != digito2) {
            System.out.printf("%3d", digito2);
        }

        if (0 != digito3) {
            System.out.printf("%3d", digito3);
        }

        if (0 != digito4) {
            System.out.printf("%3d", digito4);
        }

        if (0 != digito5) {
            System.out.printf("%3d", digito5);
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        SeparaciondeDijitos dig = new SeparaciondeDijitos();
        Scanner t = new Scanner(System.in);

        int num;

        do {
            System.out.println("Ingresa un numero menor a 100000 y mayor a 0: ");
            num = t.nextInt();

        } while ((100000 < num) || (0 > num));

        dig.Imprime(num);
    }

}
