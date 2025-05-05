package ModuloModelos;

import java.util.Date;

public class Boleto {

   
    private Date fechaCompra;
    private String id;
    private Asiento asiento;
    private Pasajero pasajero;
    private Ruta ruta;
    private double precio;

    public Boleto(String id,Date fechaCompra, Pasajero pasajero,Asiento asiento, Ruta ruta, double precio) {
       this.fechaCompra= fechaCompra;
        this.id = id;
        this.pasajero = pasajero;
        this.precio = precio;
        this.asiento= asiento;
        this.ruta=ruta;
       
    }
   /**
     * @return the fechaCompra
     */
    public Date getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the asiento
     */
    public Asiento getAsiento() {
        return asiento;
    }

    /**
     * @param asiento the asiento to set
     */
    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    /**
     * @return the pasajero
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    /**
     * @return the ruta
     */
    public Ruta getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
