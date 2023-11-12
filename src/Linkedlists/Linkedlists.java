/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlists;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class Linkedlists {

    public static void main(String[] args) {
        LinkedList<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(1, "Raul", 19));
        lista.add(new Persona(2, "Santiago", 16));
        lista.add(new Persona(3, "Wendy", 20));
        lista.add(new Persona(4, "Justin", 19));
        
        // Agregar al principio
        // Aumentamos un index
        lista.add(0, new Persona(5, "Moises", 19));
        
        
        // ---------Foreach-------------    Solo usan recorridos forEach
        // No tienen un indice predeterminado
         /*for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        } */
         
         //Eliminar en LinkedList
         
         String nombreBorrar = "Raul";
         for(Persona perso2:lista){
             if(perso2.getNombre().equals(nombreBorrar)){
                 lista.remove(perso2);
                 break; //Corto que deje recorrer
             }
         }
         // Volver a recorrer
         for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
         
         //Tamaño de la lista en Linkedlist
         System.out.println("-----------Que tamaño tiene las listas?-------------");
         System.out.println("LinkedList: " + lista.size());
         
         //Obtener el primer objeto
         System.out.println("------------Primer y Ultimo objeto (Solo para LINKED LIST)---------------");
         
         System.out.println("Primero de LinkedList: " + lista.getFirst().toString());

         System.out.println("Último de LinkedList: " + lista.getLast().toString());
         
         // Borrar toda la lista
         System.out.println("----------Borrando Listas------------");
         lista.clear();
          
         // Comprobar si esta vacia
         System.out.println("------------Esta vacia alguna Lista?------------");
         System.out.println("Linkedist: " + lista.isEmpty());
    }
}
