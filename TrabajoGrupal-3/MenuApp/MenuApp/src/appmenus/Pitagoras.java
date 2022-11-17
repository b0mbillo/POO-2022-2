package appmenus;

public class Pitagoras {
    public static double calcular_hipotenusa(double cateto_a, double cateto_b){
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(cateto_a,2) + Math.pow(cateto_b,2));
        return hipotenusa;
    }
}
