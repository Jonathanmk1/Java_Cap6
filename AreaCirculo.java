package Metodos;

import java.util.Scanner;

public class AreaCirculo {

    public double Area(double radio) {
        double area;

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: " + area);

        return area;
    }

    public static void main(String[] args) {
        AreaCirculo area = new AreaCirculo();
        Scanner t = new Scanner(System.in);

        double rad;

        System.out.println("Ingresa el radio del circulo: ");
        rad = t.nextDouble();

        area.Area(rad);
    }

}
