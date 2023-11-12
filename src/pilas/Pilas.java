/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author Tomas
 */
public class Pilas {

    public static void main(String[] args) {
        // Inicializar una pila o stack
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());

        // Agregar con push
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //Recorrido
        
        for(Integer pilita : pila){
            System.out.println(pilita);
        }
        
        // Mostrar
        System.out.println("Pila " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        int datoEliminar = 2;
        
        //Crear una pila auxiliar
        Stack <Integer> pilaAuxiliar = new Stack <Integer>();
        
        //Eliminar el dato numero 2
        while(!pila.isEmpty()){
            int elemento = pila.pop();
            if(elemento != datoEliminar) {
                pilaAuxiliar.push(elemento);
            }
        }
        
        while(!pilaAuxiliar.isEmpty()){
            pila.push(pilaAuxiliar.pop());
        }
        
         System.out.println("Dato " + datoEliminar + " eliminado.");

        // Imprimir la pila actual
        System.out.println("Pila actual: " + pila);
        
        //pila.pop(); //Eliminar el ultimo registro que entro
        System.out.println("Esta el 3? " + pila.search(4));
        System.out.println("Utimo agregado: " + pila.peek());
        
    }
}
