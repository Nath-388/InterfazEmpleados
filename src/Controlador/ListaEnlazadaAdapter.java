/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ModuloEstructuras.ListaEnlazada;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;



public class ListaEnlazadaAdapter<T> implements JsonSerializer<ListaEnlazada<T>>, JsonDeserializer<ListaEnlazada<T>>{
    @Override
    public JsonElement serialize(ListaEnlazada<T> lista, Type type, JsonSerializationContext context){
        JsonArray jsonArray= new JsonArray();
        for (int i = 0; i < lista.tamaño(); i++) {
            jsonArray.add(context.serialize(lista.obtener(i)));
        }
        return jsonArray;
    }
    @Override
    public ListaEnlazada<T> deserialize(JsonElement json, Type type, 
                                         JsonDeserializationContext context) 
                                         throws JsonParseException {
        ListaEnlazada<T> lista = new ListaEnlazada<>();
        JsonArray jsonArray = json.getAsJsonArray();
        for (JsonElement element : jsonArray) {
            lista.agregarAlFinal(context.deserialize(element, getItemType(type)));
        }
        return lista;
    }

    private Type getItemType(Type listType) {
        // Obtener el tipo genérico (T) de MiListaEnlazada<T>
        return ((ParameterizedType) listType).getActualTypeArguments()[0];
    }
}
    

