package Main;
import java.util.Scanner;
import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;
public class Ejercicio_24 {
	public static void main(String[] args) {
		
		
		
		int Cod,Cods,Codsa, Codigo;
		double Sal,Totsuc;
		String Nom;
		
		Scanner Sc = new Scanner(System.in);
		
		
		System.out.print("CodEmpleado: ");
		Cods = Sc.nextInt();
		
		System.out.print("CodSucu: ");
		Cod = Sc.nextInt();
		
		System.out.print("NombreEm: ");
		Nom = Sc.next();
		
		
		System.out.print("SalarioEm: ");
		Sal = Sc.nextDouble();
		
		while(Cod != 0) {
			
			System.out.println(" ");
			System.out.println("REPORTE DE SALARIOS SUCURSAL: " + Cods);
			System.out.println("Codigo		Nombres 	Salario");
			Codsa = Cods;
			Totsuc = 0;
			
			while((Cods == Codsa)&&(Cod != 0)) {
				
				Totsuc = (Totsuc + Sal);
				System.out.println(Cod+"		"+Nom+"		"+Sal);
				
				System.out.print("CodEmpleado: ");
				Cod = Sc.nextInt();
				
				if(Cod != 0) {
					
					
					
					System.out.print("CodSucu: ");
					Cods = Sc.nextInt();
					
		
					System.out.print("CodSucu: ");
					Nom = Sc.next();
					
					
					System.out.print("SalarioEm: ");
					Sal = Sc.nextDouble();
					
					
				}
				
				//System.out.println("Codigo		Nombres		Salario");
				
				
			}
			System.out.println("TOTAL SALARIOS DE LA SUCURSAL: $"+ Totsuc);
		}
	}
	
}


