package Main;
import java.util.Scanner;
public class Ejercicio_21 {

	public static void main(String[] args) {
		
		int Nt, Ter, Cont, Ban;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("ingrese el numero de repeticiones: ");
		Nt = Sc.nextInt();
		Ter = 17;
		Cont = 1;
		Ban = 1;
		System.out.println("	NT" + "		TER" + "		CONT" + "	BAN");
		System.out.println("	" +Nt);
		while(Cont <= Nt) {
			
			
			System.out.println("	"  + "		" + Ter +  "		" +Cont+ "	"+Ban);
			if(Ban ==  1) {
				Ter = Ter-2;
				Ban = 2;
				}
			else {
				Ter = Ter+3;
				Ban=1;
			}
			Cont = Cont + 1;
		}
		
	}
	
}
