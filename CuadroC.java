
package Metodos;

import java.util.Scanner;

public class CuadroC {
    public void Cuadrado(int n, char c) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CuadroC cuadrado = new CuadroC();
        Scanner t = new Scanner (System.in);
        
        int lado;
        char cad;
        
        System.out.println("Ingresa un entero: ");
        lado = t.nextInt();
        
        System.out.println("Ingresa el carracterRelleno: ");
        cad = t.next().charAt(0);
        
        cuadrado.Cuadrado(lado, cad);
    }
    
}
