/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloModelos;

/**
 *
 * @author nath_
 */
public class Asiento {
    
     private int id;
    private String categoria;
    private boolean isOcupado;

    public Asiento(String categoria, boolean isOcupado){
        this.categoria= categoria;
        this.isOcupado= isOcupado;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the isOcupado
     */
    public boolean isIsOcupado() {
        return isOcupado;
    }

    /**
     * @param isOcupado the isOcupado to set
     */
    public void setIsOcupado(boolean isOcupado) {
        this.isOcupado = isOcupado;
    }
   
    
    
}
