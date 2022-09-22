package Metodos;

import java.util.Scanner;

public class Temperatura {

    public double ConvertirC(double c) {
        double f;

        f = 9.0 / 5.0 * c + 32;

        return f;
    }

    public double ConvertirF(double f) {
        double c;

        c = 5.0 / 9.0 * (f - 32);

        return c;
    }

    public static void main(String[] args) {
        Temperatura convertir = new Temperatura();
        Scanner t = new Scanner(System.in);

        int op;
        double cen, far;

        System.out.println("Ingresa 1 para convertir centigrados a fahrenheit: ");
        System.out.println("Ingresa 2 para convertir fahrenheit a centigrados: ");
        op = t.nextInt();

        if (op == 1) {
            System.out.println("Ingresa los centigrados a convertir: ");
            cen = t.nextDouble();

            System.out.println(cen + " centigrados equivalen a " + convertir.ConvertirC(cen) + " fahrenheit");
        } else if (op == 2) {
            System.out.println("Ingresa los fahrenheit a convertir: ");
            far = t.nextDouble();

            System.out.println(far + " fahrenheit equivalen a " + convertir.ConvertirF(far) + " centigrados");
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
