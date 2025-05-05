package ModuloModelos;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Horario {

   
    private String id;
    private Date fecha;
    private LocalTime horaSalida;
    private LocalTime horallegada;
    

    public Horario(String id, Date fecha, LocalTime horaSalida, LocalTime horallegada) {
        this.id = id;
        this.fecha= fecha;
        this.horaSalida = horaSalida;
        this.horallegada = horallegada;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the horaSalida
     */
    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the horallegada
     */
    public LocalTime getHorallegada() {
        return horallegada;
    }

    /**
     * @param horallegada the horallegada to set
     */
    public void setHorallegada(LocalTime horallegada) {
        this.horallegada = horallegada;
    }
    
}
