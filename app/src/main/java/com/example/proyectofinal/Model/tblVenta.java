package com.example.proyectofinal.Model;

import java.util.Date;

public class tblVenta {
    private int id;
    private int idCliente;
    private int idUsuario;
    private Date fecha;
    private float subtotal;
    private float total;
    private String estado;

    public tblVenta(){

    }

    public tblVenta(int id, int idCliente, int idUsuario, Date fecha, float subtotal, float total, String estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
