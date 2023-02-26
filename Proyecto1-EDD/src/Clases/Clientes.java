/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Andrea
 */
public class Clientes {
   
    public String Nombre, Apellido;
    public int Cedula;
    public Clientes next;

    public Clientes( String Nombre, String Apellido, int Cedula) {
      
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.next = null;
    }
    
    
    
}
