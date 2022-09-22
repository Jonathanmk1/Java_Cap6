
package Metodos;

public class Hipotenusa {
    public double Hipotenusa(double ld1, double ld2){
        double hipotenusa;
        
        hipotenusa = Math.sqrt((ld1 * ld1) + (ld2 * ld2));
        
        return hipotenusa;
    }

    public static void main(String[] args) {
        Hipotenusa hip = new Hipotenusa();
        
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Triangulo", "Lado 1", "Lado 2", "Hipotenusa");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "1", "3.0", "4.0", hip.Hipotenusa(3.0, 4.0));
        System.out.printf("%-10s %-10s %-10s %-10s\n", "2", "5.0", "12.0", hip.Hipotenusa(5.0, 12.0));
        System.out.printf("%-10s %-10s %-10s %-10s\n", "3", "8.0", "15.0", hip.Hipotenusa(8.0, 15.0));
    }
    
}
