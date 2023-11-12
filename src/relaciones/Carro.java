/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

import java.util.List;

/**
 *
 * @author Tomas
 */
public class Carro {
    private Long id;
    private String marca;
    private String modelo;
    
    // Una relacion de uno a muchos
    // Un carrro tiene muchos propietarios
    
    private List<Propietario> listaPropietarios;

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
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

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }
    
    
    
    
}
