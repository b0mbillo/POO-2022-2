import java.util.Scanner;
public class ejercicio_24 {
	
	
	
	public static void main(String[] args) {
		System.out.println("¿Cual esfera es mas pesada?");
		Scanner Sc = new Scanner(System.in);
		double A,B,C;
		
		System.out.println("ingrese es peso de la esfera A: ");
		A=Sc.nextInt();
		System.out.println("ingrese es peso de la esfera B: ");
		B=Sc.nextInt();
		System.out.println("ingrese es peso de la esfera C: ");
		C=Sc.nextInt();
		
		if(A == B && A== C) {
			System.out.println("las 3 esferas son iguales");
			
		}
		else if(A > B && A > C) {
			System.out.println("A es la esfera mas pesada");}
		else if(B > A && B > C) {
			System.out.println("B es la esfera mas pesada");}
		else if(C > A && C > B) {
			System.out.println("C es la esfera mas pesada");}
	}

}
