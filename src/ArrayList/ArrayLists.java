/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;



/**
 *
 * @author Tomas
 */
public class ArrayLists {
    public static void main(String [] args){
        // Inicializar un array List
        ArrayList<Persona> lista = new ArrayList<Persona> ();
        // Todo en una sola puse los parametros del contrcutor Persona
        lista.add(new Persona(1,"Raul", 19));
        lista.add(new Persona(2,"Santiago", 16));
        lista.add(new Persona(3,"Wendy", 20));
        lista.add(new Persona(4,"Justin", 19));
        
        System.out.println("---------FOR-----------");
        
        //Recorrer por indice
        // En lista usamos el size
        /* for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        // Recorrer elemento por elemnto foreach
        System.out.println("---------FOREACH-----------");
        
        for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        } */
        
        
        // Eliminar en ArrayList
        lista.remove(1);
        
        for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
        
         //Tamaño de la lista en ArrayList
         System.out.println("-----------Que tamaño tiene las listas?-------------");
         System.out.println("ArrayList: " + lista.size());
         
           // Borrar toda la lista
         System.out.println("----------Borrando Listas------------");
         lista.clear();
          
         // Comprobar si esta vacia
         System.out.println("------------Esta vacia alguna Lista?------------");
         System.out.println("ArrayList: " + lista.isEmpty());
    }
}