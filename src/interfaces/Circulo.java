/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Tomas
 */
public class Circulo implements Figura, Dibujable, Rotable {
     private double radio;

    public Circulo( ) {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override   //Sobreescritura de metodos
    public double calcularArea() {
        double pi = 3.14;
        double re = pi * radio;
        return re;
    }
 
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando un circulo");
    }
}
