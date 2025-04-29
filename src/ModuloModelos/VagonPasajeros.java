package ModuloModelos;

public class VagonPasajeros extends Vagon{
    private boolean[] asientosPremium;
    private boolean[] asientosEjecutivo;
    private boolean[] asientosEstandar;

    public VagonPasajeros(String id) {
        super(id);
        this.asientosPremium = new boolean[4];
        this.asientosEjecutivo= new boolean[8];
        this.asientosEstandar= new boolean[22];
    }
    
    public boolean reservarAsiento(String tipo, int numero){
        boolean[] asientos = obtenerAsientosPorTipo(tipo);
        if(numero>= 0 && numero < asientos.length && !asientos[numero]){
            asientos[numero]= true;
            return true;
        }
        return false;
    }
    
    public boolean liberarAseitno(String tipo, int numero){
        boolean[] asientos = obtenerAsientosPorTipo(tipo);
        if(numero>=0 && numero<asientos.length && asientos[numero]){
            asientos[numero]=false;
            return true;
        }
        return false;
    }
    
    public int asientosDisponibles(String tipo){
        boolean[] asientos= obtenerAsientosPorTipo(tipo);
        int disponibles=0;
        for (boolean ocupado: asientos){
            if(!ocupado) disponibles++;
            
        }
        return disponibles;
    }
    
    private boolean[] obtenerAsientosPorTipo(String tipo){
        switch(tipo.toLowerCase()){
            case "premium": return asientosPremium;
            case "ejecutivo": return asientosEjecutivo;
            case "estandar": return asientosEstandar;
            default: throw new IllegalArgumentException("Tipo de asiento no válido");
            
        }
    }
  public boolean[] getAsientosPremium() {
        return asientosPremium;
    }
 public boolean[] getAsientosEjecutivo() {
        return asientosEjecutivo;
    }
  public boolean[] getAsientosEstandar() {
        return asientosEstandar;
    }
}
