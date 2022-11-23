import java.io.*;

import java.util.Scanner;

public class CRUD {
    String fichero;
    CRUD(String archivo) {
        this.fichero = archivo;
    }


    void agregar() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true));
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la cedula: ");
        String ced = input.nextLine().strip();
        System.out.println("Digite el nombre: ");
        String nom = input.nextLine().strip();
        System.out.println("Digite el apellido: ");
        String ape = input.nextLine().strip();
        bw.write(new contacto(ced,nom,ape).resumen());
        bw.newLine();
        System.out.println("Contacto añadido");
        bw.close();
    }

    void eliminar() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true));
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la cedula del contacto: ");
        String ced = input.nextLine().strip();
        
        br.close();
        bw.close();
    }

    void editar(){

    }

    void consultar() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la cedula del contacto: ");
        String ced = input.nextLine().strip();
        String linea;
        boolean found = false;
        while((linea = br.readLine()) != null){
            if (linea.contains("Cedula: " + ced)) {
                System.out.println(linea);
                found = true;
                break;
            }
        }
        if (!found){System.out.println("No se encontro contacto con cedula "+ced);
        System.out.println("Alguna Tecla para continuar");
        new Scanner(System.in).nextLine();}
        br.close();
    }

    void menu() throws IOException {
        while(true){
            System.out.println("\nQue desea hacer con "+fichero+": \n 1: Añadir dato \n 2: Eliminar dato \n 3: Editar dato \n 4: Consultar dato \n Otro Num: Salir");
            switch (menuIn.rOpcion()){
                case 1:
                    agregar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    System.out.println("editar");
                    break;
                case 4:
                    consultar();
                    break;
                default:
                    System.out.println("Finalizado");
                    System.exit(0);
                    break;
            }
        }
    }
}
