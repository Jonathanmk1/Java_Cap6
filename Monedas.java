
package Metodos;

import java.util.Random;
import java.util.Scanner;

public class Monedas {
     public void Lanzamiento() {

        Random aleatorios = new Random();
        int numero;
        int Escala = 2;
        int contadorCara = 0;
        int contadorCruz = 0;
        int centinela = 0;
        Scanner entrada = new Scanner(System.in);

        while (-1 != centinela) {
            numero = aleatorios.nextInt(Escala);

            if (0 == numero) {
                contadorCara++;
                System.out.println("\nEl resultado del lanzamiento es cara.");
            }
            else {
                contadorCruz++;
                System.out.println("\nEl resultado del lanzamiento es cruz.");
            }

            System.out.println("\nQuiere volver a lanzar una moneda?");
            System.out.println("\nIntroduzca un entero, -1 para terminar.");
            centinela = entrada.nextInt();

        }

        System.out.printf("\nEl numero de caras es: %d\n", contadorCara);
        System.out.printf("\nEl numero de cruces es: %d\n", contadorCruz);

        return;
    }

    public static void main(String[] args) {
        Monedas moneda = new Monedas();
        
        moneda.Lanzamiento();
    }
    
}
