/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Andrea
 */
public class Almacen {
    
    public String Nombre;
    public String Productos;
    public Almacen next;

    public Almacen( String Nombre, String Productos) {
        
        this.Nombre = Nombre;
        this.Productos = Productos;
        this.next = null;
    }
    
    public void EliminarProducto(String producto){
        this.Productos = Productos.replaceAll("/"+producto," ");
    }
    
}
