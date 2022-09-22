
package Metodos;

import java.util.Scanner;

public class MCD {
        public static int mcd(int num1, int num2) {

        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);

        return resultado;

    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int num1 = t.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 = t.nextInt();

        int res = mcd(num1, num2);

        System.out.println("MCD: " + res);
    }
    
}
