/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Funciones {
    public Grafo grafoGuardado;
    public ListaClientes clientesGuardado;
    public ListaAlmacenes almacenGuardado;
    public ListaPedidos pedidosGuardado;
    public ListaRutas rutaGuardado;
    public ListaProductos productoGuardado;
    public boolean full;
    
    public Funciones() {
        this.clientesGuardado = new ListaClientes();
        this.almacenGuardado = new ListaAlmacenes();
        this.pedidosGuardado = new ListaPedidos();
        this.rutaGuardado = new ListaRutas();
        this.productoGuardado = new ListaProductos();
        this.full = false;
    }

  
    
    
    /**
     * Description: Escoge un archivo txt y carga sus datos en los atributos de la clase
     */
    public void cargarArchivo() {
        String info_txt = "";
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        File archivo = jf.getSelectedFile();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    info_txt += line + "\n";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura");
        }
        try {
            if (!"".equals(info_txt)) {
                JOptionPane.showMessageDialog(null, "Archivo cargado en el sistema.");
                this.full = true;
            } else {
                JOptionPane.showMessageDialog(null, "El archivo esta vacío");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura");
        }
        
    }
    
    
}