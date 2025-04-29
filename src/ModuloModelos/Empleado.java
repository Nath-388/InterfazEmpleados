package ModuloModelos;

public class Empleado {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    private String tipo;
    private String username;
    private String password;

    public Empleado(String nombres, String apellidos, String cedula, String correo, String telefono, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
        this.username= generarUsername();
        this.password= generarPassword();
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String cargo) {
        this.tipo = cargo;
    }
    private String generarUsername(){
        return cedula + "@UrbanLink.com";
    }
    private String generarPassword(){
        return cedula;
    }
    public boolean isAdmin(){
        return "admin".equalsIgnoreCase(tipo);
    }
     public String getUsername() { return username; }
    public String getPassword() { return password; }
}
