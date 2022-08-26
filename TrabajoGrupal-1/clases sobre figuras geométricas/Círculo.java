public class Círculo {
    int radio;

    Círculo(int radio) {
        this.radio = radio;
    }
    double CalcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
