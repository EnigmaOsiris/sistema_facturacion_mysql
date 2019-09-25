package Logica;

public class Opciones {
    private String valor;
    private String decripcion;

    public Opciones() {
    }

    public Opciones(String valor, String decripcion) {
        this.valor = valor;
        this.decripcion = decripcion;
    }

    public String getValor() {
        return valor;
    }

    public String getDecripcion() {
        return decripcion;
    }
    
    public String toString(){
        return decripcion;
    }
    
}
