package ModuloEstructuras;

public class NodoLista<T> {

    private T dato;
    private NodoLista<T> siguiente;

    NodoLista(T dato) {
        this.dato = dato;
    }
     public T getDato() {
        return dato;
    }
      public void setDato(T dato) {
        this.dato = dato;
    }
      public void setSiguiente(NodoLista<T> siguiente) {
        this.siguiente = siguiente;
    }
       public NodoLista<T> getSiguiente() {
        return siguiente;
    }
    
}
