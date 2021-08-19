package com.example.proyectofinal.Model;

public class tblCategoria {
    private int id;
    private String nombre;
    private String Descripcion;

    public tblCategoria() {
    }

    public tblCategoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
