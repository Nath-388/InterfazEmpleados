package ModuloModelos;

import ModuloEstructuras.ListaEnlazada;

public class Pasajero {

   
    private String nombres;
    private String apellidos;
    private int teléfono;
    private ListaEnlazada<Equipaje> equipaje;
    private String identificacion;
    private String dirección;
    private String categoria;
    

    public Pasajero(String nombres, String apellidos, int teléfono, String identificacion, String dirección, String categoria) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.equipaje = new ListaEnlazada<Equipaje>();
        this.identificacion = identificacion;
        this.dirección = dirección;
        this.categoria = categoria;
    }
    public void agregarEquipaje(Equipaje equipaje){
        this.getEquipaje().agregarAlFinal(equipaje);
        
    }
    public double pesoTotalEquipaje(){
        double total=0;
        for (Equipaje e : getEquipaje()) {
            if(e != null){
                total += e.getPeso();
            }
            
        }
        return total;
    }
     /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the teléfono
     */
    public int getTeléfono() {
        return teléfono;
    }

    /**
     * @param teléfono the teléfono to set
     */
    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    /**
     * @return the equipaje
     */
    public ListaEnlazada<Equipaje> getEquipaje() {
        return equipaje;
    }

    /**
     * @param equipaje the equipaje to set
     */
    public void setEquipaje(ListaEnlazada<Equipaje> equipaje) {
        this.equipaje = equipaje;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the dirección
     */
    public String getDirección() {
        return dirección;
    }

    /**
     * @param dirección the dirección to set
     */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   
}