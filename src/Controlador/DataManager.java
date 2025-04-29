/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ModuloEstructuras.ListaEnlazada;
import ModuloModelos.Boleto;
import ModuloModelos.Empleado;
import ModuloModelos.Horario;
import ModuloModelos.Ruta;
import ModuloModelos.Tren;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class DataManager {
    // Archivos JSON
    private static final String USERS_FILE = "users.json";
    private static final String TRAINS_FILE = "trenes.json";
    private static final String ROUTES_FILE = "rutas.json";
    private static final String SCHEDULES_FILE = "horarios.json";
    private static final String TICKETS_FILE = "boletos.json";

    private final Gson gson;

    public DataManager() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(new TypeToken<ListaEnlazada<Empleado>>(){}.getType(), new ListaEnlazadaAdapter<Empleado>())
            .registerTypeAdapter(new TypeToken<ListaEnlazada<Tren>>(){}.getType(), new ListaEnlazadaAdapter<Tren>())
            .registerTypeAdapter(new TypeToken<ListaEnlazada<Ruta>>(){}.getType(), new ListaEnlazadaAdapter<Ruta>())
            .registerTypeAdapter(new TypeToken<ListaEnlazada<Horario>>(){}.getType(), new ListaEnlazadaAdapter<Horario>())
            .registerTypeAdapter(new TypeToken<ListaEnlazada<Boleto>>(){}.getType(), new ListaEnlazadaAdapter<Boleto>())
            .setPrettyPrinting()
            .create();
        
        crearArchivosSiNoExisten();
    }

    private void crearArchivosSiNoExisten() {
        crearArchivo(USERS_FILE);
        crearArchivo(TRAINS_FILE);
        crearArchivo(ROUTES_FILE);
        crearArchivo(SCHEDULES_FILE);
        crearArchivo(TICKETS_FILE);
    }

    private void crearArchivo(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(gson.toJson(new ListaEnlazada<Object>())); // Array vacío
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // ==================== MÉTODOS PARA USUARIOS (Empleados) ====================
    public void guardarUsuarios(ListaEnlazada<Empleado> usuarios) {
        guardarDatos(USERS_FILE, usuarios);
    }

    public ListaEnlazada<Empleado> cargarUsuarios() {
        return cargarDatos(USERS_FILE, new TypeToken<ListaEnlazada<Empleado>>(){}.getType());
    }

    // ==================== MÉTODOS PARA TRENES ====================
    public void guardarTrenes(ListaEnlazada<Tren> trenes) {
        guardarDatos(TRAINS_FILE, trenes);
    }

    public ListaEnlazada<Tren> cargarTrenes() {
        return cargarDatos(TRAINS_FILE, new TypeToken<ListaEnlazada<Tren>>(){}.getType());
    }

    // ==================== MÉTODOS PARA RUTAS ====================
    public void guardarRutas(ListaEnlazada<Ruta> rutas) {
        guardarDatos(ROUTES_FILE, rutas);
    }

    public ListaEnlazada<Ruta> cargarRutas() {
        return cargarDatos(ROUTES_FILE, new TypeToken<ListaEnlazada<Ruta>>(){}.getType());
    }

    // ==================== MÉTODOS PARA HORARIOS ====================
    public void guardarHorarios(ListaEnlazada<Horario> horarios) {
        guardarDatos(SCHEDULES_FILE, horarios);
    }

    public ListaEnlazada<Horario> cargarHorarios() {
        return cargarDatos(SCHEDULES_FILE, new TypeToken<ListaEnlazada<Horario>>(){}.getType());
    }

    // ==================== MÉTODOS PARA BOLETOS ====================
    public void guardarBoletos(ListaEnlazada<Boleto> boletos) {
        guardarDatos(TICKETS_FILE, boletos);
    }

    public ListaEnlazada<Boleto> cargarBoletos() {
        return cargarDatos(TICKETS_FILE, new TypeToken<ListaEnlazada<Boleto>>(){}.getType());
    }

    // ==================== MÉTODOS PRIVADOS GENÉRICOS ====================
    private <T> void guardarDatos(String filename, ListaEnlazada<T> datos) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(datos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> ListaEnlazada<T> cargarDatos(String filename, Type tipo) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, tipo);
        } catch (IOException e) {
            e.printStackTrace();
            return new ListaEnlazada<>();
        }
    }
}
