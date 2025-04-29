package ModuloServicios;

import ModuloEstructuras.ListaEnlazada;
import ModuloModelos.Empleado;

public class Autenticacion {
    private static Empleado usuarioIngresado;
     private static ListaEnlazada<Empleado> empleados;

    
    public Autenticacion(){
        empleados= new ListaEnlazada<Empleado>();
        usuarioIngresado=null;
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.agregarAlFinal(empleado);
    }
    public static boolean login(String username, String password){
        
        for (Empleado empleado: empleados){
            if(empleado.getUsername().equals(username) &&  empleado.getPassword().equals(password)){
                usuarioIngresado= empleado;
                System.out.println("el empleado que inicia sesion es: " + usuarioIngresado.getNombres());
                return true;
                
            }
            
        }
        return false;
        
    }
     public static Empleado getUsuarioIngresado() {
        return usuarioIngresado;
    }
     public static ListaEnlazada<Empleado> getEmpleados(){
         return empleados;
     }
   
}
