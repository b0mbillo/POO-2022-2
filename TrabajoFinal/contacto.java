public class contacto {
    String Cedula;
    String Nombre;
    String Apellido;
    contacto(String ced, String nom, String ap){
        this.Cedula = ced;
        this.Nombre = nom;
        this.Apellido = ap;
    }

    String resumen(){
        return "Cedula: "+Cedula+", Nombre: "+Nombre+", Apellido: "+Apellido;
    }
}
