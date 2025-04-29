package ModuloModelos;

public abstract class Vagon {
    private String id;
   

    public Vagon(String id) {
        this.id = id;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  
}
