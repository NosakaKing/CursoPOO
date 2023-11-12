/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Tomas
 */
public class POO {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(1, "Juan", "Perez");
        //Imprimir alumno 2
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        // Colocar datos a alumno 1
        alu1.setId(8);
        alu1.setNombre("Martin");
        alu1.setApellido("Pilar");
        // Imprimir alumno 1
        System.out.println("---------------");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido()); 
        
        //Modificar datos
        System.out.println("---------------");
        alu2.setId(35);
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        // Metodos
        alu1.mostrarNombre();
        alu2.mostrarNombre();
    }
}
