/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Cliente{
    
    private String nombre;
    private String direccion;
    private final List<Pedidos> listaPedidos;  
            
    public Cliente(String nombre, String descripcion,String direccion) {
        this.direccion = direccion; 
        this.listaPedidos = new ArrayList<>();
        this.nombre = nombre;
    }

    
    public void agregarPedido(Pedidos pedidos){
         listaPedidos.add(pedidos); 
        
    }
    
    
   
    public List<Pedidos> getlistaPedidos (){
        return listaPedidos;     
             
    
}

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaPedidos=" + listaPedidos + '}';
    }
    
    

}