public class Círculo {
    public static void main (String[] args) {
        circulo figura1 = new circulo(2);
        System.out.println("El perimetro del círculo es = " + figura1.calcular_perimetro() + "\n");
        System.out.println("El area del círculo es = " + figura1.calcular_area() + "\n");
    }
}
class circulo {
    int radio;

    circulo(int radio) {
        this.radio = radio;
    }
    double calcular_area() {
        return Math.PI * Math.pow(radio, 2);
    }
    double calcular_perimetro() {
        return 2 * Math.PI * radio;
    }
}