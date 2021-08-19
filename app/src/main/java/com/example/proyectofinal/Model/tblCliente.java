package com.example.proyectofinal.Model;

public class tblCliente {
    private int id;
    private String cedula;
    private String nombre;
    private int edad;
    private String telefono;
    private String direccion;
    private String email;

    public tblCliente(){

    }

    public tblCliente(int id, String cedula, String nombre, int edad, String telefono, String direccion, String email){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
