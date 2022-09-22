
package Metodos;

import java.util.Scanner;

public class Multiplos {
     public static boolean esMultiplo(int n1, int n2){
        if(n2 % n1 == 0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int nu1, nu2;
        
        System.out.println("Ingresa el numero 1: ");
        nu1 = t.nextInt();
        
        System.out.println("Ingresa el numero 2: ");
        nu2 = t.nextInt();
        
        boolean r = esMultiplo(nu1, nu2);
        
        System.out.println(r);
        
    }
    
    
}
