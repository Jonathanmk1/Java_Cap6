
package Metodos;

import java.util.Scanner;

public class AdivinaNumero {
    public int guess;

    public int secretNumber = (int) (Math.random() * 999 + 1);

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;

    }

    public static void main(String[] args) {
        AdivinaNumero ad = new AdivinaNumero();
        Scanner t = new Scanner(System.in);

        while (ad.getGuess() != ad.secretNumber) {
            System.out.println("Ingresa un numero entre 1 y 1000: ");
            int setGuess = t.nextInt();
            ad.setGuess(setGuess);

            if (ad.secretNumber < ad.guess) {
                System.out.println("Demasiado alto");
            } else if (ad.secretNumber > ad.guess) {
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("Felicidades, adivino el numero");
            }
        }
    }
    
}
