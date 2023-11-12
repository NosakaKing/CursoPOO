/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Tomas
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alu =  new Alumno();
        Alumno alu2 = new Alumno(1, "Raul", "Duran");
        
        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());

    }

}
