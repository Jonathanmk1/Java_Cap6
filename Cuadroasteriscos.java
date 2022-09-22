
package Metodos;

import java.util.Scanner;

public class Cuadroasteriscos {
    public void Cuadradoaa(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cuadroasteriscos c = new Cuadroasteriscos();
        Scanner t = new Scanner (System.in);
        
        int lado;
        
        System.out.println("Ingresa un entero: ");
        lado = t.nextInt();
        
        c.Cuadradoaa(lado);
    }
    
}
