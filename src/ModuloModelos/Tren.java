package ModuloModelos;

import ModuloEstructuras.ListaEnlazada;

public class Tren {
    private String tipo;
    private String id;
    private double capacidadCarga;
    private double kilometraje;
    private ListaEnlazada<Vagon> vagones;

    public Tren(String tipo, String id,  double kilometraje) {
        this.tipo = tipo;
        this.id = id;
        this.kilometraje = kilometraje;
        this.vagones = new ListaEnlazada<Vagon>();
        if("Merecedes-Benz".equalsIgnoreCase(tipo)){
            this.capacidadCarga = 28;
        } else if("Arnold".equalsIgnoreCase(tipo)){
            this.capacidadCarga=32;
        }
    }

    public void agregarVagon(Vagon vagon){
        if(vagones.tamaño()<capacidadCarga){
            vagones.agregarAlFinal(vagon);
        } else{
            throw new IllegalStateException("No se pueden agregar más vagones. Capacidad ´máxima alcanzada");
        }
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        if("Mercedes-Benz".equalsIgnoreCase(tipo)){
            this.capacidadCarga=28;
        } else if("Arnold".equalsIgnoreCase(tipo)){
            this.capacidadCarga=32;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

 public ListaEnlazada<Vagon> getVagones(){
     return vagones;
 }
    
}
