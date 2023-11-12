/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Tomas
 */
public class Excepciones {

    public static void main(String[] args) {
        // Excepciones, errores de Java
        int edades[] = {15,12,23,30};
        try{
        System.out.println("La edad de la posicion 4 es : " + edades[4]);
        }
        catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
    }
}
 