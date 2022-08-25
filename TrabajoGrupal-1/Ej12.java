import java.util.Scanner;

public class Ej12 {
  /*  Algoritmo
  NOM: Nombre del trabajador.
  NHT: Número de horas trabajadas.
  VHN: Valor hora normal trabajada.
  HET: Horas extras trabajadas.
  HEE8: Horas extras que exceden de 8.
  SALARIO: Pago total que recibe el trabajador.
  INICIO
    LEA: NOM, NHT, VHN
    SI NHT > 40 ENTONCES
            HET = NHT - 40
            SI HET > 8 ENTONCES
                HEE8 = HET - 8
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN
            SINO
                 SALARIO = 40 * VHN + HET * 2 * VHN
            FIN_SI
    SINO
            SALARIO = NHT * VHN
    FIN_SI
    ESCRIBA: “EL TRABAJADOR”, NOM, “DEVENGO: $”, SALARIO
    FIN_INICIO*/
    public static void main(String[] args){
      String NOM;
      int HET, HEE8, NHT;
      double VHN, SALARIO;
      Scanner sc = new Scanner(System.in);
      NOM = sc.nextLine();
      NHT = sc.nextInt();
      VHN = sc.nextDouble();

      if (NHT>40){
        HET = NHT-40;
        if (HET>8) {
          HEE8 = HET - 8;
          SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
        } else{SALARIO = 40 * VHN + HET * 2 * VHN;}
      } else {SALARIO = NHT * VHN;}
      System.out.println("EL TRABAJADOR "+ NOM+ " DEVENGO: $"+ SALARIO);
    }
}

