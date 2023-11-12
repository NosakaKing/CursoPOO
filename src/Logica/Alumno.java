/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
public class Alumno {
    int id;
    String nombre;
    String apellido;
    
    public Alumno(){
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {   //Obtener
        return nombre;
    }

    public void setNombre(String nombre) {   //Colocar, establecer un dato, y moddificarlos
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Metodos
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre " + nombre +  " " + apellido);
    }
    // Parametros
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobe la materia");
        }else{
            System.out.println("No aprobe");
        }
    }
}
