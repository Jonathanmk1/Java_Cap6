
package Metodos;

import java.util.Scanner;

public class Primos {
    public String Primo(int x) {
        String Estatus = "primo";

        for (int i = 2; i <= x / 2; i++) {

            if (0 == x % i) {
                Estatus = "compuesto";
            }

        }
        return Estatus;
    }

    public static void main(String[] args) {
        Primos p = new Primos();
        Scanner t = new Scanner(System.in);

        String auxiliar;
        int tamano = 10000;

        for (int i = 2; i <= tamano; i++) {
            auxiliar = p.Primo(i);

            if ("primo" == auxiliar) {
                System.out.printf("%d \n", i);
            }
        }

    }
    
}
