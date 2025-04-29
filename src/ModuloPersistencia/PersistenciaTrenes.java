package ModuloPersistencia;
import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.NodoLista;
import ModuloModelos.Tren;
import ModuloModelos.Vagon;
import com.google.gson.reflect.TypeToken;
import com.google.gson.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class PersistenciaTrenes {
    private ListaEnlazada<Tren> trenes;
    private final String archivo = "trenes.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public PersistenciaTrenes() {
        trenes = cargarTrenes();
    }

    private ListaEnlazada<Tren> cargarTrenes() {
        try (Reader reader = new FileReader(archivo)) {
            Type tipoLista = new TypeToken<ArrayList<Tren>>() {}.getType();
            ArrayList<Tren> listaTemporal = gson.fromJson(reader, tipoLista);

            ListaEnlazada<Tren> listaFinal = new ListaEnlazada<>();
            if (listaTemporal != null) {
                for (Tren t : listaTemporal) {
                    listaFinal.agregarAlFinal(t);
                }
            }
            return listaFinal;
        } catch (FileNotFoundException e) {
            return new ListaEnlazada<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ListaEnlazada<>();
        }
    }

    private void guardarTrenes() {
        ArrayList<Tren> listaTemporal = new ArrayList<>();
        NodoLista<Tren> actual = trenes.getCabeza();
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

    public void agregarTren(Tren tren) {
        trenes.agregarAlFinal(tren);
        guardarTrenes();
    }

    public void eliminarTren(String id) {
        NodoLista<Tren> actual = trenes.getCabeza();
        while (actual != null) {
            if (actual.getDato().getId().equals(id)) {
                trenes.eliminar(actual.getDato());
                break;
            }
            actual = actual.getSiguiente();
        }
        guardarTrenes();
    }

    public void editarTren(String id, String nuevoNombre, int nuevaCapacidad, Vagon[] nuevosVagones) {
        NodoLista<Tren> actual = trenes.getCabeza();
        while (actual != null) {
            if (actual.getDato().getId().equals(id)) {
                actual.getDato().setNombre(nuevoNombre);
                actual.getDato().setCapacidadCarga(nuevaCapacidad);
                actual.getDato().setVagones(nuevosVagones);
                break;
            }
            actual = actual.getSiguiente();
        }
        guardarTrenes();
    }

    public ListaEnlazada<Tren> obtenerTrenes() {
        return trenes;
    }

    

    
}

