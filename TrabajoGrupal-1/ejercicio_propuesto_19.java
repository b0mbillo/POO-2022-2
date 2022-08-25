import java.util.Scanner;

public class ejercicio_propuesto_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese medida del lado del tríangulo equilátero: ");
        float lado = entrada.nextFloat();

        float perimetro = 3*lado;
        double altura = (Math.sqrt(3)*lado)/2;
        double area = (lado*altura)/2;

        System.out.println("Perímetro: "+perimetro+"\n"+"Altura: "+altura+"\n"+"Área: "+area);
    }
}
