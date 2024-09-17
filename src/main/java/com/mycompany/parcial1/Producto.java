package com.mycompany.parcial1;

public abstract class Producto {
    
    
    
    private String nombre; 
    private String descripcion; 
    private int precio; 
    private int CantidadInventario; 
   
    public Producto(String nombre, String descripcion, int precio, int CantidadInventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.CantidadInventario = CantidadInventario;
    }
   
    
    
public String getNombre() { return nombre; }
public String getDescripcion() { return descripcion; }
public double getPrecio() { return precio; }
public int getCantidadInventario() { return CantidadInventario;
}

    public void setCantidadInventario(int CantidadInventario) {
        this.CantidadInventario = CantidadInventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", CantidadInventario=" + CantidadInventario + '}';
    }


}