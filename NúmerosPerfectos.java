
package Metodos;

public class NúmerosPerfectos {
    public static boolean numeroPerfecto(int numero) {
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }

        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (numeroPerfecto(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
