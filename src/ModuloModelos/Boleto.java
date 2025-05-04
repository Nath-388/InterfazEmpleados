package ModuloModelos;
import java.time.LocalDateTime;
import java.util.Date;

public class Boleto {
    private String id;
    private Date fechaCompra;
    private Date fechaSalida;
    private Pasajero pasajero;
    private Asiento asiento;
    private Ruta ruta;
    private Tren tren;
    private double precio;

    public Boleto(Date fechaCompra, String id, Date fechaSalida, LocalDateTime fechaLlegada, Pasajero pasajero, Tren tren, double precio) {
        this.fechaCompra = fechaCompra;
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.pasajero = pasajero;
        this.tren = tren;
        this.precio = precio;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    ;

}
