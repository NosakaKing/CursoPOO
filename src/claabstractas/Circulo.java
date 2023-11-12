
package claabstractas;

public class Circulo extends Figura {
    
    private double radio;

    public Circulo( ) {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    @Override   //Sobreescritura de metodos
    public double calcularArea() {
        double pi = 3.14;
        double re = pi * radio;
        return re;
    }
    
    
    
}
 