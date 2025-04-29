package ModuloModelos;

import ModuloEstructuras.ListaEnlazada;

public class Ruta {
    private String id;
    private Tren tren;
    private Horario horario;
    private ListaEnlazada<Estacion> estacionesVisitadas;

    public Ruta(String id, Tren tren, Horario horario, ListaEnlazada<Estacion> estacionesVisitadas) {
        
        this.id = id;
        this.tren = tren;
        this.horario = horario;
        this.estacionesVisitadas = estacionesVisitadas;
    }
    public void agregarEstacion(Estacion estacion){
        estacionesVisitadas.agregarAlFinal(estacion);
    }

   

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public ListaEnlazada<Estacion> getEstaciones() {
        return estacionesVisitadas;
    }

    public void setEstaciones(ListaEnlazada<Estacion> estaciones) {
        this.estacionesVisitadas = estaciones;
    }
}
