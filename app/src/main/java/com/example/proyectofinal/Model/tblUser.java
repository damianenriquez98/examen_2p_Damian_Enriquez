package com.example.proyectofinal.Model;

public class tblUser {
    private int Id;
    private String Email;
    private String Password;
    private String Nombre;

    public tblUser(int id, String email, String password, String nombre) {
        Id = id;
        Email = email;
        Password = password;
        Nombre = nombre;
    }

    public tblUser(String s, String toString, String s1) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
