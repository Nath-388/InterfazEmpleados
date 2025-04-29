/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloPersistencia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 *
 * @author nath_
 */
class GestorJSON {
    private static final Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();

    // Leer JSON desde archivo
    public static <T> T leer(String rutaArchivo, Type tipo) throws IOException {
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, tipo);
        }
    }

    // Escribir JSON a archivo
    public static void escribir(String rutaArchivo, Object objeto) throws IOException {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        }
    }

    // Convertir objeto a String JSON
    public static String aJson(Object objeto) {
        return gson.toJson(objeto);
    }

    // Convertir String JSON a objeto
    public static <T> T desdeJson(String json, Class<T> clase) {
        return gson.fromJson(json, clase);
    }
}

