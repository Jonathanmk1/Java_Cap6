package Metodos;

import java.util.Scanner;

public class ParoImpar {

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int cont = 0, nu;

        while (cont <= 5) {
            System.out.println("Ingresa un numero: ");
            nu = t.nextInt();

            boolean r = esPar(nu);

            System.out.println(r);

            cont++;
        }
    }

}
