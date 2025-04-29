/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloServicios;

import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.NodoLista;
import ModuloModelos.Empleado;
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

public class GestionCredenciales {
     private ListaEnlazada<Empleado> empleados;
    private final String archivo = "credenciales.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public GestionCredenciales() throws IOException {
    this.empleados= cargarCredenciales();
}
    public ListaEnlazada<Empleado> cargarEmpleados() throws IOException{
        try(Reader reader = new FileReader(archivo)){
            Type tipoLista = new TypeToken<ArrayList<Empleado>>(){}.getType();
            ArrayList<Empleado> listaTemporal = gson.fromJson(reader, tipoLista);
            
            ListaEnlazada<Empleado> listaFinal = new ListaEnlazada<>();
            if(listaTemporal !=null){
                for(Empleado t: listaTemporal){
                    listaFinal.agregarAlFinal(t);
                }
            }
            return listaFinal;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return new ListaEnlazada<>();
        }
    }
    private void guardarEmpleados(){
        ArrayList<Empleado> listaTemporal = new ArrayList<>();
        NodoLista<Empleado> actual = empleados.getCabeza();
        while(actual!= null){
            listaTemporal.add(actual.getDato());
            actual=actual.getSiguiente();
        }
        try (Writer writer = new FileWriter(archivo)){
            gson.toJson(listaTemporal, writer);
        }
        catch (IOException e){
        e.printStackTrace();
        }
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.agregarAlFinal(empleado);
        guardarEmpleados();
    }
    public void eliminarEmpleado(String cedula){
        NodoLista<Empleado> actual = empleados.getCabeza();
        while(actual!=null){
            if(actual.getDato().getCedula().equals(cedula)){
                empleados.eliminar(actual.getDato());
                break;
            }
            actual = actual.getSiguiente();
        }
        guardarEmpleados();
    }
    // private String nombres;
    //private String apellidos;
   // private String cedula;
    //private String correo;
    //private int telefono;
    //private String cargo;
    public void editarEmpleados(String cedula, String nombres,String apellidos, String correo, String telefono, String cargo){
        NodoLista<Empleado> actual= empleados.getCabeza();
        while(actual!=null){
            if(actual.getDato().getCedula().equals(cedula)){
                actual.getDato().setNombres(nombres);
                actual.getDato().setApellidos(apellidos);
                actual.getDato().setCorreo(correo);
                actual.getDato().setCargo(cargo);
                actual.getDato().setTelefono(telefono);
                break;
            
            }
            actual = actual.getSiguiente();
        }
        guardarEmpleados();
    }
    public ListaEnlazada<Empleado> obtenerEmpleados(){
        return empleados;
    }
}
