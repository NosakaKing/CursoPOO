/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claabstractas;

/**
 *
 * @author Tomas
 */
public class ClaAbstractas {
    public static void main (String [] args){
        Cuadrado ca = new Cuadrado(4,5,10);
        Circulo ci = new Circulo(30,5,10);
        
        //Imprimir
        System.out.println("El area del cuadrado es: " + ca.calcularArea());
        System.out.println("El area del circulo es: " + ci.calcularArea());
    }
}
