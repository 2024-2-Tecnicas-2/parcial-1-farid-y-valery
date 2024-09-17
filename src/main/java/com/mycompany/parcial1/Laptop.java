/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Laptop extends Producto {
    private String marca; 
    private String procesador; 

    public Laptop(String nombre, String descripcion, int precio, int CantidadInventario,String marca,String procesador) {
        super(nombre, descripcion, precio, CantidadInventario);
        this.marca = marca; 
        this.procesador = procesador; 
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", procesador=" + procesador + '}';
    }
    
    
}
