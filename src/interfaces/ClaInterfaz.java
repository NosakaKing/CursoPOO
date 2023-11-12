/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Tomas
 */
public class ClaInterfaz {
    
    public static void main (String [] args){
        Circulo ci = new Circulo(30);
        Cuadrado ca = new Cuadrado(4);
        
        // Imprimir
        System.out.println("El area del circulo es: " + ci.calcularArea() );
        System.out.println("El area del cuadrado es: " + ca.calcularArea() );
        
        //Imprimir metodos rotar y dibujar 
        
        ci.dibujar();
        ci.rotar();
        ca.dibujar();
    }
}
