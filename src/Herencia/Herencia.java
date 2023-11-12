/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Tomas
 */
public class Herencia {
    
    public static void main (String [] args) {
    
    //Polimorfismo
    Persona vector [] = new Persona [5];
    vector[0] = new Persona();
    vector [1] = new Empleado();
    vector [2] = new Consultor();
    vector [3] =  new Jefe();
    
    Persona perso = new Persona();
    Consultor consul = new Consultor();
    perso = consul;
    // Instancia
    Empleado em = new Empleado();
    Consultor con = new Consultor();
    
    //Uso del getter 
    em.getNombre();
    em.getNum_legajo();
    // Uso del getter 
    con.getNombre_consultora();
    con.getNombre();
            
    
    }
    
}
