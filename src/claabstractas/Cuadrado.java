/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claabstractas;

/**
 *
 * @author Tomas
 */
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado, double x, double y){
        super(x,y);
        this.lado = lado;
    }

    
    @Override
    public double calcularArea() {
        double re = lado * lado;
        return re;
    }
    
}
