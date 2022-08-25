import java.util.Scanner;

public class ejercicio_propuesto_22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        String nom = entrada.nextLine();

        System.out.print("Ingrese salario básico por hora: ");
        double salhora = entrada.nextDouble();

        System.out.print("Ingrese horas trabajadas al mes: ");
        double horasmes = entrada.nextDouble();

        double salario = salhora * horasmes;

        if (salario > 450000) {
            System.out.println(nom + " - " + salario);
        }
        else {
            System.out.println(nom);
        }
    }
}
