/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ModuloEstructuras.ListaEnlazada;
import ModuloEstructuras.TablaHash;
import ModuloModelos.Empleado;

/**
 *
 * @author nath_
 */
public class AuthController {
     private Empleado currentUser;  // Empleado con sesión activa
    private final ListaEnlazada<Empleado> empleados;
    private final TablaHash<String, Empleado> empleadosPorUsername; // Para búsquedas rápidas
    private final DataManager dataManager;

    public AuthController() {
        this.dataManager = new DataManager();
        this.empleados = dataManager.cargarUsuarios();
        this.empleadosPorUsername = new TablaHash<>();
        cargarEnTablaHash();
        crearAdminPorDefectoSiNoExiste();
    }

    private void cargarEnTablaHash() {
        for (int i = 0; i < empleados.tamaño(); i++) {
            Empleado emp = empleados.obtener(i);
            empleadosPorUsername.insertar(emp.getUsername(), emp);
        }
    }

    private void crearAdminPorDefectoSiNoExiste() {
        if (!empleadosPorUsername.contieneClave("admin@UrbanLink.com")) {
            Empleado admin = new Empleado(
                "Admin", 
                "Sistema", 
                "0000000000",  // Cédula = contraseña
                "admin@UrbanLink.com", 
                "0000000000", 
                "admin"        // Tipo admin
            );
            empleados.agregarAlFinal(admin);
            empleadosPorUsername.insertar(admin.getUsername(), admin);
            dataManager.guardarUsuarios(empleados); // Guarda en JSON
        }
    }

    // Método para iniciar sesión
    public boolean login(String username, String password) {
        Empleado emp = empleadosPorUsername.obtener(username);
        if (emp != null && emp.getPassword().equals(password)) {
            currentUser = emp;  // Asigna el usuario actual
            return true;
        }
        return false;
    }

    // Método para cerrar sesión
    public void logout() {
        currentUser = null;
    }

    // Método para obtener el usuario actual (¡Ahora sí existe!)
    public Empleado getCurrentUser() {
        return currentUser;
    }

    // Método para verificar si el usuario actual es admin
    public boolean isAdmin() {
        return currentUser != null && currentUser.getTipo().equals("admin");
    }

    // Método opcional: agregar nuevo empleado (solo admin)
    public boolean agregarEmpleado(Empleado nuevoEmpleado) {
        if (currentUser == null || !isAdmin()) return false;
        
        empleados.agregarAlFinal(nuevoEmpleado);
        empleadosPorUsername.insertar(nuevoEmpleado.getUsername(), nuevoEmpleado);
        dataManager.guardarUsuarios(empleados);
        return true;
    }
}
    

