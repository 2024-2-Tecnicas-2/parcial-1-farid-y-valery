/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Accesorios  extends Producto{
    
    private String auriculares; 
   
    
    
    public Accesorios(String nombre, String descripcion, int precio, int CantidadInventario) {
        super(nombre, descripcion, precio, CantidadInventario);
 
    }

    @Override
    public String toString() {
        return "Accesorios{" + "auriculares=" + auriculares + '}';
    }
    
    
   
}
