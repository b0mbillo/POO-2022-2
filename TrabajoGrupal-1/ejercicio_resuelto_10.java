import java.util.Scanner;

public class ejercicio_resuelto_10 {
    public static void main(String[] args) {
        double pat, pago=50000;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite su número de inscripción: ");
        String ID = entrada.nextLine();

        System.out.print("Digite su nombre: ");
        String nom = entrada.nextLine();

        System.out.print("Ingrese su patrimonio: ");
        pat = entrada.nextDouble();

        System.out.print("Ingrese el estrato: ");
        int est = entrada.nextInt();

        if (pat>2000000 && est>3){
            pago = pago + 0.03*pat;
        }

        System.out.println("El estudiante con número de inscripción "+ID+" y nombre "+nom+", debe pagar "+pago+"$");
    }
}
