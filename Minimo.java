
package Metodos;

import java.util.Scanner;

public class Minimo {
    public float Minimo(float x, float y, float z){
        float minimo;
        
        minimo = Math.min(x, y);
        minimo = Math.min(x, z);
        minimo = Math.min(y, z);
        minimo = Math.min(y, x);
        minimo = Math.min(z, x);
        minimo = Math.min(z, y);
        
        return minimo;
        
    }

    public static void main(String[] args) {
        Minimo minimo = new Minimo();
        Scanner t = new Scanner (System.in);
        
        float n1, n2, n3;
        
        System.out.println("Ingresa el primer numero");
        n1 = t.nextFloat();
        
        System.out.println("Ingresa el segundo numero");
        n2 = t.nextFloat();
        
        System.out.println("Ingresa el tercer numero");
        n3 = t.nextFloat();
        
        System.out.println("El minimo es: "+minimo.Minimo(n1, n2, n3));
    }
}
