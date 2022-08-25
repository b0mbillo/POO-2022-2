import java.util.Scanner;

public class ejercicio_resuelto_11 {
    public static void main(String[] args){
        int a, b, c, mayor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        a = entrada.nextInt();

        System.out.print("Digite el segundo número: ");
        b = entrada.nextInt();

        System.out.print("Digite el tercer número" );
        c = entrada.nextInt();

        if (a>b && a>c){
            mayor = a;
        }
        else if (b>a && b>c){
            mayor = b;
        }
        else {
            mayor = c;
        }

        System.out.println("El número mayor entre "+a+", "+b+" y "+c+" es "+mayor);
    }
}
