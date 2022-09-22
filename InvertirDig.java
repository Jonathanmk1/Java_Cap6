
package Metodos;

import java.util.Scanner;

public class InvertirDig {
    public int Invertir (int n){
        int cifra, inverso = 0;
        
        while(n != 0){
            cifra = n % 10;
            inverso = (inverso * 10) + cifra;
            n /= 10;
        }
        return inverso;
    }

    public static void main(String[] args) {
        InvertirDig inverso = new InvertirDig();
        Scanner t = new Scanner (System.in);
        
        int num;
        
        System.out.println("Ingresa un numero: ");
        num = t.nextInt();
        
        System.out.println("Inverso: "+inverso.Invertir(num));
        
    }
    
}
    

