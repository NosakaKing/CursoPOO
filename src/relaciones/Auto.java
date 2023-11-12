/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

/**
 *
 * @author Tomas
 */
public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    private Propietario prop;   // Uno a Uno Un propietario tiene un Auto
    
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, Propietario prop) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
}
