package ModuloModelos;

import ModuloEstructuras.ListaEnlazada;

public class VagonEquipaje extends Vagon{
    private ListaEnlazada<Equipaje> equipaje;
    private double capacidadMaxima= 1000;

    public VagonEquipaje(String id) {
        super(id);
        this.equipaje = new ListaEnlazada<Equipaje>();
    }
    
    public boolean agregarEquipaje(Equipaje equipaje){
        if(pesoActual()+ equipaje.getPeso() <= capacidadMaxima){
            this.equipaje.agregarAlFinal(equipaje);
            equipaje.setVagonAsignado(this);
            return true;
            
        }
        return false;
    }
    
    public double pesoActual(){
        double total=0;
        for (int i = 0; i < equipaje.tamaño(); i++) {
            total+=equipaje.obtener(i).getPeso();
        }
        return total;
    }

    public ListaEnlazada<Equipaje> getEquipaje() {
        return equipaje;
    }

   
}
