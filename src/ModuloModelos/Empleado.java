package ModuloModelos;

public class Empleado {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String tipo;
    private String username;
    private String password;

    public Empleado(String nombres, String apellidos, String cedula, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
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
