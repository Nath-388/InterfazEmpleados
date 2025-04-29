package ModuloEstructuras;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;



public class ListaEnlazada<T> implements Iterable<T>{


    private NodoLista<T> cabeza;
    private int tamaño;
    
public ListaEnlazada(){
    cabeza=null;
    tamaño=0;
}
 @Override
    public Iterator<T> iterator() {
        return new IteradorLista<>(cabeza);
    }

    // Clase interna para el iterador
    private static class IteradorLista<T> implements Iterator<T> {
        private NodoLista<T> actual;

        IteradorLista(NodoLista<T> cabeza) {
            this.actual = cabeza;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos en la lista");
            }
            T dato = actual.getDato();
            actual = actual.getSiguiente();
            return dato;
        }
    }
    public void agregarAlFinal(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLista<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamaño++;
    }

   

    public boolean eliminar(T dato) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getDato().equals(dato)) {
            cabeza = cabeza.getSiguiente();
            tamaño--;
            return true;
        }
        NodoLista<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            tamaño--;
            return true;
        }
        return false;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño){
           throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        NodoLista<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    public boolean contiene(T dato) {
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public void imprimir() {
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
    public NodoLista<T> getCabeza() {
        return cabeza;
    }
    public ListaEnlazada<T> filtrar(Predicate<T> predicado){
        ListaEnlazada<T> resultado = new ListaEnlazada<>();
        NodoLista<T> actual = cabeza;
        while(actual != null){
            if(predicado.test(actual.getDato())){
                resultado.agregarAlFinal(actual.getDato());
            }
            actual= actual.getSiguiente();
        }
        return resultado;
    }
    public void clear(){
        cabeza=null;
        tamaño=0;
    }

}
