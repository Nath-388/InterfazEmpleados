package ModuloServicios;

import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.NodoLista;
import ModuloModelos.Estacion;
import ModuloModelos.Horario;
import ModuloModelos.Ruta;
import ModuloModelos.Tren;
import ModuloModelos.Vagon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GestionRutas {
 private ListaEnlazada<Ruta> rutas;
    private final String archivo = "rutas.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public GestionRutas() throws IOException {
        this.rutas = cargarRutas();
    }

    public ListaEnlazada<Ruta> cargarRutas() throws IOException {
        try (Reader reader = new FileReader(archivo)) {
            Type tipoLista = new TypeToken<ArrayList<Ruta>>() {}.getType();
            ArrayList<Ruta> listaTemporal = gson.fromJson(reader, tipoLista);

            ListaEnlazada<Ruta> listaFinal = new ListaEnlazada<>();
            if (listaTemporal != null) {
                for (Ruta t : listaTemporal) {
                    listaFinal.agregarAlFinal(t);
                }
            }
            return listaFinal;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ListaEnlazada<>();
        }
    }

    private void guardarRutas() {
        ArrayList<Ruta> listaTemporal = new ArrayList<>();
        NodoLista<Ruta> actual = rutas.getCabeza();
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

    public void agregarRuta(Tren tren){
        rutas.agregarAlFinal(tren);
        guardarRutas();
    }
    public void eliminarTren(String id){
        NodoLista<Ruta> actual = rutas.getCabeza();
        while(actual!=null){
            if(actual.getDato().getId().equals(id)){
                rutas.eliminar(actual.getDato());
                break;
            }
            actual = actual.getSiguiente();
        }
        guardarRutas();
    }
 
    
    public void editarTrenes(String id, Horario horario, Tren tren, Estacion[] estaciones){
        NodoLista<Ruta> actual= rutas.getCabeza();
        while(actual!=null){
            if(actual.getDato().getId().equals(id)){
                actual.getDato().setTren(tren); ;
                actual.getDato().setHorario(horario);
                actual.getDato().setEstaciones(estaciones);
                break;
            
            }
            actual = actual.getSiguiente();
        }
        guardarRutas();
    }
    public ListaEnlazada<Ruta> obtenerRutas(){
        return rutas;
    }
}
    