package Main;
import java.util.Scanner;
public class Ejercicio_15 {

	public static void main(String[] args) {
		
		double PesoA, PesoB, PesoC, PesoD;
		Scanner Sc = new Scanner(System.in);
		
		
		
		System.out.print("Ingrese el peso A: ");
		PesoA = Sc.nextDouble();
		
		System.out.print("Ingrese el peso B: ");
		PesoB = Sc.nextDouble();
		System.out.print("Ingrese el peso C: ");
		PesoC = Sc.nextDouble();
		System.out.print("Ingrese el peso D: ");
		PesoD = Sc.nextDouble();
		
		if((PesoA == PesoB) && (PesoA == PesoC)){
			if(PesoD > PesoA) {
				System.out.println("La esfera D es la diferente y");
			}
			else {
				System.out.println("La esfera D es la diferente y");
			}
		}
		else {
			if((PesoA == PesoB) && (PesoA == PesoB)) {
				System.out.println("La esfera C es diferente");
				if(PesoC > PesoA) {
					System.out.println("y es de mayor peso");
				}
				else {
					System.out.println("y es de menor peso");
				}
			}
			else {
				if((PesoA == PesoC) && (PesoA == PesoD)) {
					System.out.println("La esfera B es la diferente");
					if(PesoB < PesoD) {
						System.out.println("y es de mayor peso");
					}
					else {
						System.out.println("y es de menor peso");
					}
				}
				else {
					System.out.println("La esfera A es la diferente");
					if(PesoA < PesoB) {
						System.out.println("y es de mayor peso");
					}
					else {
						System.out.println("y es de menor peso");
					}
				}
			}
			
		}
		
	}
}

























