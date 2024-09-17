/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
class Pedidos {
private Cliente cliente;
private Map productos;

    @Override
    public String toString() {
        return "Pedidos{" + "cliente=" + cliente + ", productos=" + productos + '}';
    }


public Pedidos(Cliente cliente) {
this.cliente = cliente;
this.productos = new HashMap<>();
}

public void agregarProducto(Producto producto, int cantidad) {
productos.put(producto, cantidad);
}

public Map getProductos() {
return productos;
}

public Cliente getCliente() {
return cliente;
}
    
    
}
