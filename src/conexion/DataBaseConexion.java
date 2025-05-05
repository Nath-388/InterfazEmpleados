/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import org.apache.commons.dbcp2.BasicDataSource;


public class DataBaseConexion {
    private static DataBaseConexion instance;
    private BasicDataSource dataSource;
    private String host = "localHost";
    private String port= "3306";
    private String database= "mydb";
    private String username= "nath";
    private String password= "123";
    
    public static DataBaseConexion getInstance(){
        if(instance==null){
            instance= new DataBaseConexion();
        }
        return instance;
    }
    
    private DataBaseConexion(){
        
    }
    
    
}
