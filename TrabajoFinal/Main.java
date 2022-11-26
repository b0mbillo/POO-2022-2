import java.io.IOException;

public class Main {
   /*hacer un programa que permita la gestion de datos de contactos(cedula, nombre, apellido) en un archivo de texto*/
    public static void main(String[] args) throws IOException {
        System.out.println("Que desea hacer: \n 1: Crear Archivo \n 2: Cargar Archivo \n Otro Num: Salir");
        int opcion = menuIn.rOpcion();
        switch (opcion){
            case 1:
                String file = menuIn.Crear();
                new CRUD(file).menu();
                break;
            case 2:
                String fileC = menuIn.Cargar();
                new CRUD(fileC).menu();
                break;
            default: System.out.println("Finalizado");
        }

    }
}