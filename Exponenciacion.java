
package Metodos;

import java.util.Scanner;

public class Exponenciacion {
    public int Potencia(int x, int y) {

        int potencia = 1;

        for (int i = 1; i <= y; i++) {
            potencia *= x;
        }

        return potencia;
    }

    public static void main(String[] args) {
        Exponenciacion exp = new Exponenciacion();
        
        Scanner s = new Scanner (System.in);
        
        int base, exponente, potencia;
        
        System.out.println("Ingresa la base: ");
        base = s.nextInt();
        
        System.out.println("Ingresa el exponente: ");
        exponente = s.nextInt();
        
        potencia = exp.Potencia(base, exponente);
        
        System.out.println("La base "+base+" elevada al exponente "+exponente+" es: "+potencia);
    }
    
}
