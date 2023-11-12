/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class Relaciones {
    
     public static void main(String[] args) {
        Carro ca = new Carro();
        ca.setId(1L);
        ca.setMarca("Chevrolet");
        ca.setModelo("Corsa");
        List<Propietario> listaPropietarios = new ArrayList <Propietario> ();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        // Asignar informacion a los dos propietarios
        prop1.setId(35L);
        prop1.setNombre("Raul");
        prop1.setApellido("Duran");
        
        prop2.setId(23L);
        prop2.setNombre("Justin");
        prop2.setApellido("Herrera");
        
        
        // Agregar en la Lista
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        ca.setListaPropietarios(listaPropietarios);
        
         System.out.println("El auto " + ca.getMarca() + " " + ca.getModelo() + " tiene como propietarios a: " + ca.getListaPropietarios().toString());
        
     }
}
