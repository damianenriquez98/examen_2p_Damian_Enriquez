package com.example.proyectofinal.Model;

public class tlbProducto {
    private int id;
    private String nombre;
    private float precioUnitario;
    private float coste;
    private int cantidad;
    private float iva;

    public tlbProducto(){

    }

    public tlbProducto(int id, String nombre, float precioUnitario, float coste, int cantidad, float iva) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.coste = coste;
        this.cantidad = cantidad;
        this.iva = iva;
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

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
}
