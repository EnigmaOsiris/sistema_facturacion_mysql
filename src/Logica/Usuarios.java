package Logica;
import java.io.Serializable;
public class Usuarios implements Serializable{
    private String IdUsuario;
    private String Nombre;
    private String Apellidos;
    private String Clave;
    private int Perfil;
    public Usuarios(){
        IdUsuario = "";
        Nombre = "";
        Apellidos = "";
        Clave = "";
        Perfil = 0;
    }
    
    public Usuarios(String IdUsuario, String Nombre, String Apellidos, String Clave, int Perfil) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Clave = Clave;
        this.Perfil = Perfil;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }
    
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getPerfil() {
        return Perfil;
    }

    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }
    
    public String toString(){
        return IdUsuario + "|" + Nombre + "|" + Apellidos + "|" + Clave + "|" + Perfil;
    }   
}
