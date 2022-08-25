import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args){
        /*23. Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.*/
        double a,b,c, sol1, sol2;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite los parametros de la ecuacion: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double x = Math.pow(b,2)-4*c*a;
        sol1 = (-b + Math.sqrt(x))/(2*a);
        sol2 = (-b - Math.sqrt(x))/(2*a);
        System.out.println("Las soluciones de la ecuacion son : "+sol1+", "+sol2);
    }
}

