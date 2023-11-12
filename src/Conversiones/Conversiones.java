/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones;

/**
 *
 * @author Tomas
 */
public class Conversiones {
    
     public static void main(String[] args) {
         
         double num = 1.78;
         
         // casteo a entero
         
         int numInt = (int) num;
         
         // casteo a Long
         Long numLong = (long) num;
         
         System.out.println("Version Double: " + num );
         System.out.println("Version Int: " + numInt );
         System.out.println("Version Long: " + numLong );
         
         // String a enteros, doubles etc.
         String cantidad = "15";
         String precio = "150.27";
         
         double re = Integer.parseInt(cantidad) * Double.parseDouble(precio);
         System.out.println("El total a pagar: " + re);
         
         // Conversion a String
         int edad = 30;
         double estatura = 1.67;
         
         String edadString = String.valueOf(edad);
         String estaturaString = String.valueOf(estatura);
         
         System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
         
     }
}
