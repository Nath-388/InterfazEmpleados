package ModuloServicios;

import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.NodoLista;
import ModuloModelos.Boleto;
import ModuloModelos.Estacion;
import ModuloModelos.Horario;
import ModuloModelos.Pasajero;
import ModuloModelos.Ruta;
import ModuloModelos.Tren;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestionPasajeros {
   
    
     private ListaEnlazada<Boleto> boletos;
    private final String archivo = "boletos.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public GestionPasajeros() throws IOException {
        this.boletos = cargarBoletos();
    }

    public ListaEnlazada<Boleto> cargarBoletos() throws IOException {
        try (Reader reader = new FileReader(archivo)) {
            Type tipoLista = new TypeToken<ArrayList<Boleto>>() {}.getType();
            ArrayList<Boleto> listaTemporal = gson.fromJson(reader, tipoLista);

            ListaEnlazada<Boleto> listaFinal = new ListaEnlazada<>();
            if (listaTemporal != null) {
                for (Boleto t : listaTemporal) {
                    listaFinal.agregarAlFinal(t);
                }
            }
            return listaFinal;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ListaEnlazada<>();
        }
    }

    private void guardarBoletos() {
        ArrayList<Boleto> listaTemporal = new ArrayList<>();
        NodoLista<Boleto> actual = boletos.getCabeza();
        while (actual != null) {
            listaTemporal.add(actual.getDato());
            actual = actual.getSiguiente();
        }
        try (Writer writer = new FileWriter(archivo)) {
            gson.toJson(listaTemporal, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarBoleto(Boleto boleto){
        boletos.agregarAlFinal(boleto);
        guardarBoletos();
    }
    public void eliminarBoleto(String id){
        NodoLista<Boleto> actual = boletos.getCabeza();
        while(actual!=null){
            if(actual.getDato().getId().equals(id)){
                boletos.eliminar(actual.getDato());
                break;
            }
            actual = actual.getSiguiente();
        }
        guardarBoletos();
    }

    
    public void editarTrenes(String id, LocalDateTime fechaCompra, LocalDateTime fechaLlegada, LocalDateTime fechaSalida, Pasajero pasajero, Tren tren, double precio){
        NodoLista<Boleto> actual= boletos.getCabeza();
        while(actual!=null){
            if(actual.getDato().getId().equals(id)){
                actual.getDato().setFechaCompra(fechaCompra); 
                actual.getDato().setFechaLlegada(fechaLlegada);
                actual.getDato().setFechaSalida(fechaSalida);
                actual.getDato().setPasajero(pasajero);
                actual.getDato().setPrecio(precio);
                actual.getDato().setTren(tren);
                break;
            
            }
            actual = actual.getSiguiente();
        }
        guardarBoletos();
    }
    public ListaEnlazada<Boleto> obtenerBoletos(){
        return boletos;
    }
}

