import java.util.Scanner;
public class Ejercicio_21 {

	public static void main(String[] args) { 	
		
		int lad1, lad2, lad3;
		double perimetro, s,Area;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("ingrese los lados del triangulo");
		lad1= Sc.nextInt();
		lad2= Sc.nextInt();
		lad3= Sc.nextInt();
		
		//Perimetro
		perimetro = lad1 +lad2 + lad3;
		s = (perimetro)/2;
		Area = Math.sqrt(s*((s-lad1)*(s-lad2)*(s-lad3)));
		
		System.out.println("el perimetro es: "+perimetro);
		System.out.println("el semiperimetro es: "+s);
		System.out.println("el Área es: "+Area);
	}
}
