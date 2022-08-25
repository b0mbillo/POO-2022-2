import java.util.Scanner;

public class Ej18{
/*
    18. Se tiene la siguiente información de un empleado: • código del empleado, • nombres, • número de horas trabajadas al mes, • valor hora trabajada, • porcentaje de retención en la fuente. Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto
*/
    public static void main(String[] args) {
        String cod, nom;
        float numH, valH, ret, neto, bruto, porRet;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el codigo: ");
        cod = sc.nextLine();
        System.out.println("digite el nombre: ");
        nom = sc.nextLine();
        System.out.println("digite el numero de horas trabajadas: ");
        numH = sc.nextFloat();
        System.out.println("digite el valor de cada hora: ");
        valH = sc.nextFloat();
        System.out.println("digite el porcentaje de retencion: ");
        porRet = sc.nextFloat();

        bruto = numH*valH;
        ret = bruto*porRet;
        neto = bruto-ret;

        System.out.print("El trabajador "+nom+" identificado por codigo: "+cod+", tiene un salario bruto de "+bruto+ " y salario neto de "+ neto);


    }
}