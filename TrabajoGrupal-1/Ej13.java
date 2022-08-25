import java.util.Objects;
import java.util.Scanner;

public class Ej13 {
   /* Algoritmo
   VALCOMP: Valor de la compra.
   COLOR: Color de la bolita.
   VALPAG: Valor a pagar.
   PDES: Porcentaje de descuento.
   INICIO
        LEA: VALCOMP, COLOR
        SI COLOR = “BLANCO” ENTONCES
            PDES=0
        SINO
            SI COLOR = “VERDE” ENTONCES
                 PDES = 10
            SINO
                SI COLOR=”AMARILLO” ENTONCES
                    PDES = 25
                SINO
                    SI COLOR = “AZUL” ENTONCES
                        PDES = 50
                    SINO
                        PDES = 100
                    FIN_SI
                FIN_SI
            FIN_SI
        FIN_SI
        VALPAG = VALCOMP - PDES * VALCOMP / 100
        ESCRIBA : “ EL CLIENTE DEBE PAGAR:$”, VALPAG
   FIN_INICIO*/
    public static void main(String[] args){
        String COLOR;
        double VALCOMP,VALPAG;
        int PDES;
        Scanner sc = new Scanner(System.in);
        VALCOMP = sc.nextDouble();
        COLOR = sc.next();
        if (Objects.equals(COLOR,"BLANCO")){PDES = 0;
        } else if (Objects.equals(COLOR,"VERDE")) {PDES = 10;
        } else if (Objects.equals(COLOR,"AMARILLO")) { PDES = 25;
        } else if (Objects.equals(COLOR,"AZUL")){ PDES = 50;
        } else {PDES = 100;}
        VALPAG = VALCOMP - PDES * VALCOMP / 100;
        System.out.println("EL CLIENTE DEBE PAGAR: $"+VALPAG);
    }
}
