package enriquez.damian.proyectofinal;

import java.util.Date;

public class Usuario {
    private int id;
    private String email;
    private String password;
    private String nombreUsuario;
    private String tipo;
    private String nombreApellido;
    private Date fechaRegistro;

    public Usuario(){

    }

    public Usuario(int id, String email, String password, String nombreUsuario, String tipo, String nombreApellido, Date fechaRegistro){
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.tipo = tipo;
        this.nombreApellido = nombreApellido;
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
