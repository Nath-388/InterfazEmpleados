package ModuloServicios;

import Controlador.DataManager;
import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.NodoLista;
import ModuloEstructuras.TablaHash;
import ModuloModelos.Empleado;
import ModuloModelos.Estacion;
import ModuloModelos.Horario;
import ModuloModelos.Ruta;
import ModuloModelos.Tren;
import ModuloModelos.Vagon;
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
import java.util.ArrayList;

public class GestionTrenes {

    private ListaEnlazada<Tren> trenes;
    private TablaHash<String, Tren> trenesPorId;
    DataManager dataManager;
    
    public GestionTrenes()
    {
        this.dataManager= new DataManager();
        this.trenes= dataManager.cargarTrenes();
        this.trenesPorId= new TablaHash<>();
        cargarEnTablaHash();
    }
        public boolean agregarTren(Tren tren){
            if(trenesPorId.contieneClave(tren.getId())){
                return false; //id duplicado
            }
            trenes.agregarAlFinal(tren);
            trenesPorId.insertar(tren.getId(), tren);
            dataManager.guardarTrenes(trenes);
            return true;
            
        }
        
        public ListaEnlazada<Tren> obtenerTodos(){
            return trenes;
        }
        public Tren buscarPorId(String id){
            return trenesPorId.obtener(id);
        }
        public boolean actualizarTren(String id, Tren trenActualizado){
            Tren tren = trenesPorId.obtener(id);
            if(tren==null){
                return false;
            }
            tren.setTipo(trenActualizado.getTipo());
            tren.setKilometraje(trenActualizado.getKilometraje());
            
            ListaEnlazada<Vagon> vagones = trenActualizado.getVagones();
            tren.getVagones().clear();
            for (int i = 0; i < vagones.tamaño(); i++) {
                tren.agregarVagon(vagones.obtener(i));
                
            }
            dataManager.guardarTrenes(trenes);
            return true;
        }
        public boolean eliminarTren(String id){
            Tren tren = trenesPorId.obtener(id);
            if(tren==null){
                return false;
                
            }
            trenes.eliminar(tren);
            trenesPorId.insertar(id, null);
            dataManager.guardarTrenes(trenes);
            return true;
        }
        public boolean agregarVagon(String trenId, Vagon vagon){
            Tren tren = trenesPorId.obtener(trenId);
            if(tren==null){
                return false;
            }
            try{
                tren.agregarVagon(vagon);
                dataManager.guardarTrenes(trenes);
                return true;
            } catch (IllegalStateException e){
                return false; //capacidad de carga alcanzada
            }
        }
        public boolean eliminarVagon(String trenId, String vagonId){
            Tren tren= trenesPorId.obtener(trenId);
            if(tren==null){
                return false;
            }
            ListaEnlazada<Vagon> vagones = tren.getVagones();
            for (int i = 0; i < vagones.tamaño(); i++) {
                if(vagones.obtener(i).getId().equals(vagonId)){
                    vagones.eliminar(vagones.obtener(i));
                    dataManager.guardarTrenes(trenes);
                    return true;
                
            }
        }
            return false;
        }
        private void cargarEnTablaHash(){
            for (int i = 0; i < trenes.tamaño(); i++) {
                Tren tren = trenes.obtener(i);
                trenesPorId.insertar(tren.getId(), tren);
            }
        }
    }


