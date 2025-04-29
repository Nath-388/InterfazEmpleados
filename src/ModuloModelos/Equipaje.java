package ModuloModelos;

public class Equipaje {

    private String id;
    private double peso;
    private Vagon vagonAsignado;

    public Equipaje(String id, double peso, Vagon vagonAsignado) {
        this.id = id;
        this.peso = peso;
        this.vagonAsignado = vagonAsignado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso>80){
        throw new IllegalArgumentException("El qeuipaje no puede pesar más de 80kg");
    }
        this.peso=peso;
    }

    public Vagon getVagonAsignado() {
        return vagonAsignado;
    }

    public void setVagonAsignado(Vagon vagonAsignado) {
        this.vagonAsignado = vagonAsignado;
    }



}
