package appmenus;

public class Voltaje {
    public static double calcular_voltaje(double corriente, double resistencia){
        double voltaje;
        voltaje = corriente * resistencia;
        return voltaje;
    }
}
