package Logica;
public class Productos {
    private String id_Productos;
    private String descripcion;
    private double precio;
    private int iva;
    private String notas;

    public Productos() {
        this.id_Productos = "";
        this.descripcion = "";
        this.precio = 0;
        this.iva = 0;
        this.notas = "";
    }

    public Productos(String id_Productos, String descripcion, double precio, int iva, String notas) {
        this.id_Productos = id_Productos;
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = iva;
        this.notas = notas;
    }
    
    public String getId_Productos() {
        return id_Productos;
    }

    public void setId_Productos(String id_Productos) {
        this.id_Productos = id_Productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    public String toString(){
        return id_Productos + "|" + descripcion + "|" + precio + "|" + iva + "|" + notas;
    }
}
