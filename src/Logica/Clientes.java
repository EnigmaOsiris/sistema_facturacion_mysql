package Logica;

import java.util.Date;

public class Clientes {
    private String idCliente, nombres, apellidos, direccion;
    private long telefono;
    private Date fechaNacimiento, fechaIngreso;
    private int tipoIdentificacion, ciudad;

    public Clientes() {
        idCliente = "";
        nombres = "";
        apellidos = "";
        direccion = "";
        telefono = 0;
        fechaNacimiento = null;
        fechaIngreso = null;
        tipoIdentificacion = 0;
        ciudad = 0;
    }

    public Clientes(String idCliente, String nombres, String apellidos, String direccion, long telefono, Date fechaNacimiento, Date fechaIngreso, int tipoIdentificacion, int ciudad) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.tipoIdentificacion = tipoIdentificacion;
        this.ciudad = ciudad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    
    public String toString(){
        return idCliente + "|" + nombres + "|" + apellidos + "|" + direccion + "|" + telefono + "|" + Utilidades.stringToDate(fechaNacimiento) + "|" + Utilidades.stringToDate(fechaIngreso) + "|" + tipoIdentificacion + "|" + ciudad;
    }
}
