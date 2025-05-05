package ModuloModelos;

import ModuloEstructuras.ListaEnlazada;

public class VagonPasajeros extends Vagon{

    
    
    private ListaEnlazada<Asiento> asientos;

    public VagonPasajeros(String id, ListaEnlazada<Asiento> asientos) {
        super(id);
        asientos= asientos;
    }
    /**
     * @return the asientos
     */
    public ListaEnlazada<Asiento> getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(ListaEnlazada<Asiento> asientos) {
        this.asientos = asientos;
    }
   
    
    

}
