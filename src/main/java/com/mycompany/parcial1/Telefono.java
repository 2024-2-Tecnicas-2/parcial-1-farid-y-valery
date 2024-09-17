/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Telefono extends Producto {
   
    private String marca; 
    private int almacenamiento; 

    public Telefono(String nombre, String descripcion, int precio, int CantidadInventario,String marca,int almacenamiento) {
        super(nombre, descripcion, precio, CantidadInventario);
        this.almacenamiento = almacenamiento; 
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Telefono{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
   
}
