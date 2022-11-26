import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.*;

public class CRUD {
    String fichero;

    CRUD(String archivo) throws IOException {
        this.fichero = archivo;
    }

    String Ced(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la cedula del contacto: ");
        return input.nextLine().strip();
    }

    String Registro(String ced) throws IOException {
        String linea;
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        while((linea = br.readLine()) != null){
            if (linea.contains("Cedula: " + ced+",")) {
                return linea;
            }
        }
        return null;
    }

    void Ex(String registro) {
        System.out.println(registro);
        System.out.println("Alguna Tecla para continuar");
        new Scanner(System.in).nextLine();
    }

    void Existencia(String registro,String ced){
        if (registro==null){
            System.out.println("No se encontro contacto con cedula "+ced);
            System.out.println("Alguna Tecla para continuar");
            new Scanner(System.in).nextLine();
        } else{Ex(registro);}
    }

    void consultar() throws IOException {
        String ced = Ced();
        String registro = Registro(ced);
        Existencia(registro,ced);
    }

    void agregar() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true));
        Scanner input = new Scanner(System.in);
        System.out.println("La cedula del contacto no podra ser editada luego ");
        String ced = Ced();
        String registro = Registro(ced);
        if(registro != null){
            System.out.println("Se encontro un contacto con cedula "+ced);
            Ex(registro);
            return;
        }
        System.out.println("Digite el nombre: ");
        String nom = input.nextLine().strip();
        System.out.println("Digite el apellido: ");
        String ape = input.nextLine().strip();
        bw.write(new contacto(ced,nom,ape).resumen());
        bw.newLine();
        System.out.println("Contacto añadido");
        System.out.println("Alguna Tecla para continuar");
        input.nextLine();
        bw.close();
    }

    void eliminar() throws IOException {
        Scanner scan = new Scanner(System.in);
        String ced = Ced();
        String registro = Registro(ced);
        if(registro == null){
            Existencia(null,ced);
            return;
        }else{
            Ex(registro);
        }
        System.out.println("Desea Eliminar?\n 1: Si \n Otro num: No ");
        if (menuIn.rOpcion() != 1) {
            return;
        }
        editartxt(registro,"");
        System.out.println("Contacto Eliminado");
        System.out.println("Alguna Tecla para continuar");
        scan.nextLine();
    }

    void editar() throws IOException {
        String ced = Ced();
        String registro = Registro(ced);
        if(registro == null){
            Existencia(null,ced);
            return;
        }else{
            Ex(registro);
        }
        System.out.println("Desea editar registro?\n 1: Si \n Otro num: No ");
        if (menuIn.rOpcion() != 1) {
            return;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        String nom = input.nextLine().strip();
        System.out.println("Digite el apellido: ");
        String ape = input.nextLine().strip();
        String cambio = new contacto(ced,nom,ape).resumen();
        editartxt(registro,cambio);
        System.out.println("Contacto Editado");
        System.out.println("Alguna Tecla para continuar");
    }

    private void editartxt(String registro,String cambio) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        StringBuilder viejo = new StringBuilder();
        String linea = br.readLine();
        while (linea != null) {
            viejo.append(linea).append(System.lineSeparator());
            linea = br.readLine();
        }
        String content = viejo.toString();
        String nuevo = content.replaceAll(registro,cambio);
        try (FileWriter writer = new FileWriter(fichero)) {
            writer.write(nuevo);
        }
    }

    private void mostrar() throws IOException {
        String content = new String(Files.readAllBytes(Path.of(fichero)));
        String ln = content.strip();
        Scanner scan = new Scanner(System.in);
        System.out.println(ln.replaceAll("(?m)^[ \t]*\r?\n", ""));
        System.out.println("Alguna Tecla para continuar");
        scan.nextLine();
        System.out.println();
    }


    void menu() throws IOException {
        while(true){
            System.out.println("Que desea hacer con "+fichero+": \n 1: Añadir dato \n 2: Eliminar dato \n 3: Editar dato \n 4: Consultar dato \n 5: Mostrar datos \n Otro Num: Salir");
            switch (menuIn.rOpcion()){
                case 1:
                    agregar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    consultar();
                    break;
                case 5:
                    mostrar();
                    break;
                default:
                    System.out.println("Finalizado");
                    System.exit(0);
                    break;
            }
        }
    }
}
