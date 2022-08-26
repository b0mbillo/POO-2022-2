package Main;
import java.util.Scanner;
public class Ejercicio_14 {

		public static void main(String[] args) {
		int Vd1,Vd2,Vd3;
		double Salar,Totven,Porven,Salar1,Salar2,Salar3;
		Scanner Sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese las ventas que tuvo el departamento 1: ");
		Vd1 = Sc.nextInt();
		
		System.out.print("Ingrese las ventas que tuvo el departamento 2: ");
		Vd2 = Sc.nextInt();
		
		System.out.print("Ingrese las ventas que tuvo el departamento 3: ");
		Vd3 = Sc.nextInt();

		System.out.print("Ingrese el salario que reciben los vendedores: ");
		Salar = Sc.nextInt();
		
	
		Totven = Vd1 + Vd2 +Vd3;
		
		Porven = 0.33 * Totven;
		
		if(Vd1 > Porven){
		Salar1 = (Salar +(0.2 * Salar));
		}
		else{
		Salar1 = Salar;
		}
		//------------------
		if(Vd2 > Porven){

		Salar2 = Salar +(0.2 * Salar);
		}
		else{
		Salar2 = Salar;
		}
		//------------------
		if(Vd3 > Porven){
		Salar3 = Salar +(0.2 * Salar);
		}
		else{
		Salar3 = Salar;
		}
		//------------------
		System.out.println(" ");
		System.out.println("Salario Vendedores DEPTO. 1" + Salar1 +
		"\nSalario Vendedores DEPTO. 2" + Salar2 + "\nSalario Vendedores DEPTO. 3" + Salar3);
		}
		
}
